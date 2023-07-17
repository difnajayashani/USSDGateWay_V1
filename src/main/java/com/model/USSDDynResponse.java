package com.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
public class USSDDynResponse  implements Serializable{

    @Id
    private Long id;
    private String Freeflow;
    private String charge;
    private int amount;
    private Node Response_Message;
   // List<String> addresses = new ArrayList<String>();


}