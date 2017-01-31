package com.example.shams.opendatalr.opendata_lr;

/**
 * Created by Shams on 31/01/2017.
 */

public enum FormatOPDT {
    JSON("json"),
    XML("xml");

    private String format;

    FormatOPDT(String format) {
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }
}
