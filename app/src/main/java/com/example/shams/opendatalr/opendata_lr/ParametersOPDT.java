package com.example.shams.opendatalr.opendata_lr;

/**
 * Created by Shams on 31/01/2017.
 */

public enum ParametersOPDT {
    SERVICE("service=", true),
    DB("db=", false),
    TABLE("table=", false),
    FILTER("filter=", false);

    private final String param;
    private boolean required;

    ParametersOPDT(String param, boolean required) {
        this.param = param;
        this.required = required;
    }

    public boolean isRequired() {
        return this.required;
    }

    public String getParam() {
        return this.param;
    }

    public void setRequired() {
        if (!this.required)
            this.required = true;
    }

    public void unsetRequired() {
        if (this.required)
            this.required = false;
    }
}
