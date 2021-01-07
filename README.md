# elwin-poweron-exporter

PowerOn sink service used to move data from Elwin to PowerOn

## System setup

```json
{
  "_id": "poweron",
  "type": "system:microservice",
  "docker": {
    "environment": {
      "POWERON_SOAP_URL": "https://<host name>/enmac/SOAP"
    },
    "image": "espenplatou/poweron-exporter:0.0.7",
    "port": 8090
  },
  "verify_ssl": true
}
```
## Pipe example

```json
{
  "_id": "meter-number-poweron-endpoint",
  "type": "pipe",
  "source": {
    "type": "dataset",
    "dataset": "global-meterpoint"
  },
  "sink": {
    "type": "json",
    "system": "nn-poweron",
    "batch_size": 1,
    "url": "/cd_meter_no"
  },
  "transform": {
    "type": "dtl",
    "rules": {
      "default": [
        ["filter",
          ["not", "_S._deleted"]
        ],
        ["filter",
          ["is-not-null", "_S.netteigarmaalarid"]
        ],
        ["add", "::operation", "Insert"],
        ["add", "::PropertyNumber", "_S.maalepunkt"],
        ["add", "::MeterNumber", "_S.netteigarmaalarid"],
        ["add", "::IsSmartMeter", 0],
        ["add", "::OldMeterNumber", "_S.netteigarmaalarid"],
        ["add", "::NetworkTariff", "_S.nettariff"]
      ]
    }
  },
  "pump": {
    "cron_expression": "40 3 * * ?",
    "max_consecutive_write_errors": 10,
    "max_retries_per_entity": 2,
    "max_write_errors_in_retry_dataset": 100,
    "write_retry_delay": 1
  },
  "batch_size": 1,
  "schedule_interval": 1
}

```
