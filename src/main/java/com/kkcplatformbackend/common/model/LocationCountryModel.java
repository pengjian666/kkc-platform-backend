package com.kkcplatformbackend.common.model;

public class LocationCountryModel {
    private Integer country_id;
    private String country_no;//国家编号
    private String country_name;//国家名称

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getCountry_no() {
        return country_no;
    }

    public void setCountry_no(String country_no) {
        this.country_no = country_no;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
}
