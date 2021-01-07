package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class CustomerPropertyAssociation extends SesamEntity{
    @JsonProperty("CustomerNumber")
    private String customerNumber;
    
    @JsonProperty("PropertyNumber")
    private String propertyNumber;
    
    @JsonProperty("ATCode")
    private String atCode;
    
    @JsonProperty("UsageStartDate")
    private String usageStartDate;
    
    @JsonProperty("UsageEndDate")
    private String usageEndDate;
    
    @JsonProperty("LinkReference")
    private String linkReference;
    
    @JsonProperty("LinkSystem")
    private String linkSystem;
    
    @JsonProperty("BusinessSource")
    private String businessSource;
    
    @JsonProperty("LinkAddressReference")
    private String linkAddressReference;

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPropertyNumber() {
        return this.propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public String getAtCode() {
        return this.atCode;
    }

    public void setAtCode(String atCode) {
        this.atCode = atCode;
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

    public String getLinkReference() {
        return this.linkReference;
    }

    public void setLinkReference(String linkReference) {
        this.linkReference = linkReference;
    }

    public String getLinkSystem() {
        return this.linkSystem;
    }

    public void setLinkSystem(String linkSystem) {
        this.linkSystem = linkSystem;
    }

    public String getBusinessSource() {
        return this.businessSource;
    }

    public void setBusinessSource(String businessSource) {
        this.businessSource = businessSource;
    }

    public String getLinkAddressReference() {
        return this.linkAddressReference;
    }

    public void setLinkAddressReference(String linkAddressReference) {
        this.linkAddressReference = linkAddressReference;
    }
}
