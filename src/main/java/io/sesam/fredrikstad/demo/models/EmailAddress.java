package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class EmailAddress extends SesamEntity{
    @JsonProperty(value = "EmailAddress")
    private String emailAddress;

    @JsonProperty(value = "CustomerNumber")
    private String customerNumber;
    
    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String toString() {
        return "EmailAddress{" + "emailAddress=" + this.emailAddress + ", customerNumber=" + this.customerNumber + '}';
    }
}
