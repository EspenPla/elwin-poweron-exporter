package io.sesam.fredrikstad.demo.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SesamEntity {
    @JsonProperty("_id")
    private String id;

    @JsonProperty("_deleted")
    private boolean deleted;
    
    @JsonProperty("operation")
    private String operation;

    private String status;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String toString() {
        return "SesamEntity{" + "id=" + this.id + ", deleted=" + this.deleted + ", status=" + this.status + '}';
    }
}
