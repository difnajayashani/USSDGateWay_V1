package com.model;

public class CleanUpRequest {

    private Long id;
    private String userid;
    private String password;
    private String MSISDN;
    private String clean;
    private String status;

    public CleanUpRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CleanUpRequest(Long id, String userid, String password, String MSISDN, String clean, String status) {
        this.id = id;
        this.userid = userid;
        this.password = password;
        this.MSISDN = MSISDN;
        this.clean = clean;
        this.status = status;
    }

    @Override
    public String toString() {
        return "CleanUpRequest{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", MSISDN='" + MSISDN + '\'' +
                ", clean='" + clean + '\'' +
                ", session='" + status + '\'' +
                '}';
    }
}
