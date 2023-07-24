package com.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class USSDDynRequest {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userid;
    private String password;
    private String MSISDN;
    private String MSC;
    private Date timeStamp;
    private String input;
    private String New_Request;
    private String Session_Id;
    private String status;
    private String requestLayer;



}