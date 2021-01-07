package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class CustomerClassification  extends SesamEntity{
    @JsonProperty("CustomerNumber")
    private String customerNumber;
    
    @JsonProperty("CTCode")
    private String ctCode;

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCtCode() {
        return this.ctCode;
    }

    public void setCtCode(String ctCode) {
        this.ctCode = ctCode;
    }
}
