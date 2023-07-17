package com.model;

public class CleanUpResponse {

    private Long id;
    private String response;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public CleanUpResponse(Long id, String response) {
        this.id = id;
        this.response = response;
    }

    public CleanUpResponse() {
    }
}
