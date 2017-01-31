package com.example.shams.opendatalr.opendata_lr;

/**
 * Created by Shams on 31/01/2017.
 */

public enum ServicesOPDT {
    BASES("getBases", false),
    TABLES("getTables", true),
    BASE_META_DATA("getBaseMetaData", true),
    TABLE_META_DATA("getTableMetaData", true),
    DATA("getData", true),
    RECORD_COUNT("getRecordCount", true);

    private final String service;
    private final boolean needParam;

    ServicesOPDT(String service, boolean needParam) {
        this.service = service;
        this.needParam = needParam;
    }

    public String getService() {
        return this.service;
    }

    public boolean isNeedParam() {
        return this.needParam;
    }
}
