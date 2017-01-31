package com.example.shams.opendatalr.opendata_lr;

/**
 * Created by Shams on 31/01/2017.
 */

public class OpenDataRequest {
    private final String format = "format=";
    private final char AND = '&';
    private final String KEY = AND + "key=V4FGpgLeq8NMZRoC";
    private final String mainUrl = "opendata.larochelle.fr/webservice/?";
    private String request;

    public OpenDataRequest(ServicesOPDT service, FormatOPDT format) {
        this.request = this.mainUrl;
        this.request += "";
    }

    public String getRequest() {
        return this.request;
    }
}
