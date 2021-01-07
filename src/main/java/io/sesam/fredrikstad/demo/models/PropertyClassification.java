package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class PropertyClassification extends SesamEntity {
    @JsonProperty("PropertyNumber")
    private String propertyNumber;

    @JsonProperty("PTCode")
    private int ptCode;

    public String getPropertyNumber() {
        return this.propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public int getPtCode() {
        return this.ptCode;
    }

    public void setPtCode(int ptCode) {
        this.ptCode = ptCode;
    }
}
