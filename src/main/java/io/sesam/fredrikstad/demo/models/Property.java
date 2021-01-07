package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class Property extends SesamEntity {
    @JsonProperty("PropertyNumber")
    private String propertyNumber;

    @JsonProperty("AddressNumber")
    private String addressNumber;

    public String getPropertyNumber() {
        return this.propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public String getAddressNumber() {
        return this.addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }
}
