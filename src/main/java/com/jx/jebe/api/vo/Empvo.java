package com.jx.jebe.api.vo;

/**
 * Created by xiaowei on 17/7/31.
 */
public class Empvo {
    private long empid;
    private String realname;
    private String ename;
    private long org_id;
    private String org_name;
    private String city_name;
    private int city_id;
    private int eara_id;
    private String eara_name;
    private int emp_state;
    private int email;
    private String phonenumber;

    public long getEmpid() {
        return empid;
    }

    public void setEmpid(long empid) {
        this.empid = empid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public long getOrg_id() {
        return org_id;
    }

    public void setOrg_id(long org_id) {
        this.org_id = org_id;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getEara_id() {
        return eara_id;
    }

    public void setEara_id(int eara_id) {
        this.eara_id = eara_id;
    }

    public String getEara_name() {
        return eara_name;
    }

    public void setEara_name(String eara_name) {
        this.eara_name = eara_name;
    }

    public int getEmp_state() {
        return emp_state;
    }

    public void setEmp_state(int emp_state) {
        this.emp_state = emp_state;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
