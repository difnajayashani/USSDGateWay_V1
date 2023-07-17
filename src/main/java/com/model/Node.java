package com.model;

import lombok.Data;

import java.util.List;

@Data
public class Node {

    private Long id;
    protected List<String> attributeList;
    protected String description;
    protected String tag;


}
