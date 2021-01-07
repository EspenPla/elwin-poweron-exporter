package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.sesam.fredrikstad.demo.models.SesamEntity;

public class Address extends SesamEntity {

    @JsonProperty("AddressNumber")
    private String addressNumber;

    @JsonProperty("Postcode")
    private String postcode;

    @JsonProperty("AdministrativeAreaName")
    private String administrativeAreaName;

    @JsonProperty("TownName")
    private String townName;

    @JsonProperty("StreetName")
    private String streetName;

    @JsonProperty("SecondaryAddressableObject")
    private String secondaryAddressableObject;

    @JsonProperty("PrimaryAddressableObject")
    private String primaryAddressableObject;

    @JsonProperty("QSTCode")
    private String qSTCode;

    @JsonProperty("AFTCode")
    private String aFTCode;

    @JsonProperty("GridReference")
    private String gridReference;

    @JsonProperty("LocalityName")
    private String localityName;

    @JsonProperty("GeoPosition")
    private String geoPosition;

    @JsonProperty("LotNumber")
    private String lotNumber;

    @JsonProperty("PlanNumber")
    private String planNumber;

    public String getAddressNumber() {
        return this.addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getAdministrativeAreaName() {
        return this.administrativeAreaName;
    }

    public void setAdministrativeAreaName(String administrativeAreaName) {
        this.administrativeAreaName = administrativeAreaName;
    }

    public String getTownName() {
        return this.townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getSecondaryAddressableObject() {
        return this.secondaryAddressableObject;
    }

    public void setSecondaryAddressableObject(String secondaryAddressableObject) {
        this.secondaryAddressableObject = secondaryAddressableObject;
    }

    public String getPrimaryAddressableObject() {
        return this.primaryAddressableObject;
    }

    public void setPrimaryAddressableObject(String primaryAddressableObject) {
        this.primaryAddressableObject = primaryAddressableObject;
    }

    public String getqSTCode() {
        return this.qSTCode;
    }

    public void setqSTCode(String qSTCode) {
        this.qSTCode = qSTCode;
    }

    public String getaFTCode() {
        return this.aFTCode;
    }

    public void setaFTCode(String aFTCode) {
        this.aFTCode = aFTCode;
    }

    public String getGridReference() {
        return this.gridReference;
    }

    public void setGridReference(String gridReference) {
        this.gridReference = gridReference;
    }

    public String getLocalityName() {
        return this.localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    public String getGeoPosition() {
        return this.geoPosition;
    }

    public void setGeoPosition(String geoPosition) {
        this.geoPosition = geoPosition;
    }

    public String getLotNumber() {
        return this.lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getPlanNumber() {
        return this.planNumber;
    }

    public void setPlanNumber(String planNumber) {
        this.planNumber = planNumber;
    }

    @Override
    public String toString() {
        return "Address{" + "addressNumber=" + this.addressNumber + "postcode=" + this.postcode + ", administrativeAreaName=" + this.administrativeAreaName + ", townName=" + this.townName + ", streetName=" + this.streetName + ", secondaryAddressableObject=" + this.secondaryAddressableObject + ", primaryAddressableObject=" + this.primaryAddressableObject + ", qSTCode=" + this.qSTCode + ", aFTCode=" + this.aFTCode + ", gridReference=" + this.gridReference + ", localityName=" + this.localityName + ", geoPosition=" + this.geoPosition + ", lotNumber=" + this.lotNumber + ", planNumber=" + this.planNumber + '}';
    }
}
