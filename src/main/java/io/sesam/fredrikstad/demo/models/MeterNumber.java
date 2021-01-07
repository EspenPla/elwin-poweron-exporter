package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class MeterNumber extends SesamEntity{
    @JsonProperty("PropertyNumber")
    private String propertyNumber;
    
    @JsonProperty("MeterNumber")
    private String meterNumber;
    
    @JsonProperty("IsSmartMeter")
    private int isSmartMeter;
    
    @JsonProperty("NetworkTariff")
    private String networkTariff;

    public String getPropertyNumber() {
        return this.propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public String getMeterNumber() {
        return this.meterNumber;
    }

    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }

    public int getIsSmartMeter() {
        return this.isSmartMeter;
    }

    public void setIsSmartMeter(int isSmartMeter) {
        this.isSmartMeter = isSmartMeter;
    }

    public String getNetworkTariff() {
        return this.networkTariff;
    }

    public void setNetworkTariff(String networkTariff) {
        this.networkTariff = networkTariff;
    }
}
