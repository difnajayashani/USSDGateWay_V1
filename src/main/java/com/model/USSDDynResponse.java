package com.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
public class USSDDynResponse{

   // @Id
    //private Long id;
    private String Freeflow;
    private String charge;
    private String amount;
    private String Response_Message;
   // List<String> addresses = new ArrayList<String>();


}