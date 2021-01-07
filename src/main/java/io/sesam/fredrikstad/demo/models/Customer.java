package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class Customer extends SesamEntity {

    @JsonProperty("CustomerNumber")
    private String customerNumber;

    @JsonProperty("ForeNames")
    private String foreName;

    @JsonProperty("Name")
    private String surName;

    @JsonProperty("CustomerId")
    private String customerId;

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getForeName() {
        return this.foreName;
    }

    public void setForeName(String foreName) {
        this.foreName = foreName;
    }

    public String getSurName() {
        return this.surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
