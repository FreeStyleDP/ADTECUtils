package com.adtec.jfBuilder.entity;

public class EstLongColumn extends EstLongColumnKey {
    /**
     * 
     */
    private String buf;

    /**
     * 
     * @return buf 
     */
    public String getBuf() {
        return buf;
    }

    /**
     * 
     * @param buf 
     */
    public void setBuf(String buf) {
        this.buf = buf == null ? null : buf.trim();
    }
}