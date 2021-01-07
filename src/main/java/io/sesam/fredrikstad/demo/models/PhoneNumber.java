package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class PhoneNumber extends SesamEntity{
    @JsonProperty("PropertyNumber")
    private String propertyNumber;
    
    @JsonProperty("TelephoneNumber")
    private String phoneNumber;
    
    @JsonProperty("UsageStartDate")
    private String usageStartDate;
    
    @JsonProperty("UsageEndDate")
    private String usageEndDate;
    
    @JsonProperty("Type")
    private String type;

    public String getPropertyNumber() {
        return this.propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsageStartDate() {
        return this.usageStartDate;
    }

    public void setUsageStartDate(String usageStartDate) {
        this.usageStartDate = usageStartDate;
    }

    public String getUsageEndDate() {
        return this.usageEndDate;
    }

    public void setUsageEndDate(String usageEndDate) {
        this.usageEndDate = usageEndDate;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
