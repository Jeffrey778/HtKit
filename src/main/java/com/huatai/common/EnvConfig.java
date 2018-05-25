package com.huatai.common;

/**
 * 接口url实体类
 */
public class EnvConfig {

    /**
     * 个险测试
     */
    private String indivTestUrl;

    /**
     * 个险生产
     */
    private String indivProdUrl;

    /**
     * ea测试
     */
    private String eaTestUrl;

    /**
     * ea生产
     */
    private String eaProdUrl;

    public String getIndivTestUrl() {
        return indivTestUrl;
    }

    public void setIndivTestUrl(String indivTestUrl) {
        this.indivTestUrl = indivTestUrl;
    }

    public String getIndivProdUrl() {
        return indivProdUrl;
    }

    public void setIndivProdUrl(String indivProdUrl) {
        this.indivProdUrl = indivProdUrl;
    }

    public String getEaTestUrl() {
        return eaTestUrl;
    }

    public void setEaTestUrl(String eaTestUrl) {
        this.eaTestUrl = eaTestUrl;
    }

    public String getEaProdUrl() {
        return eaProdUrl;
    }

    public void setEaProdUrl(String eaProdUrl) {
        this.eaProdUrl = eaProdUrl;
    }
}
