package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class NetworkPropertyLink extends SesamEntity {

    @JsonProperty("PropertyNumber")
    private String propertyNumber;

    @JsonProperty("FeederNumber")
    private int feederNumber;

    @JsonProperty("FeedQualityID")
    private String feederQualityID;

    @JsonProperty("Phase")
    private int phase;

    @JsonProperty("NetworkStatus")
    private int networkStatus;

    @JsonProperty("ComponentAlias")
    private String componentAlias;

    @JsonProperty("SubQualityID")
    private String subQualityID;

    public String getPropertyNumber() {
        return this.propertyNumber;
    }

    public void setPropertyNumber(String propertyNumber) {
        this.propertyNumber = propertyNumber;
    }

    public int getFeederNumber() {
        return this.feederNumber;
    }

    public void setFeederNumber(int feederNumber) {
        this.feederNumber = feederNumber;
    }

    public String getFeederQualityID() {
        return this.feederQualityID;
    }

    public void setFeederQualityID(String feederQualityID) {
        this.feederQualityID = feederQualityID;
    }

    public int getPhase() {
        return this.phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public int getNetworkStatus() {
        return this.networkStatus;
    }

    public void setNetworkStatus(int networkStatus) {
        this.networkStatus = networkStatus;
    }

    public String getComponentAlias() {
        return this.componentAlias;
    }

    public void setComponentAlias(String componentAlias) {
        this.componentAlias = componentAlias;
    }

    public String getSubQualityID() {
        return this.subQualityID;
    }

    public void setSubQualityID(String subQualityID) {
        this.subQualityID = subQualityID;
    }
}
