package com.model;

import java.util.ArrayList;
import java.util.List;

public class USSDDynMenuResponseDataSet {

    private List<Node> nodes;

    public List<Node> getNodes() {
        if (nodes ==  null) {
            nodes = new ArrayList<Node>();
        }
        return nodes;
    }

    @Override
    public String toString() {
        return "USSDDynMenuResponseDataSet{" +
                "nodes=" + nodes +
                '}';
    }
}
