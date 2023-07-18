package com.service;

import com.dao.RequestDao;
import com.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class USSDRestServiceImpl implements  USSDRestService {

    @Autowired
    private RequestDao requestDao;

    public USSDDynResponse testNormalRequest(USSDDynRequest request){
        USSDDynResponse response=new USSDDynResponse();

        Date date = new Date();
        request.setTimeStamp(date);

       // if(request.getInput() == "*123#"){
        if("*123#".equals(request.getInput())){
            response.setCharge("Y");
            response.setAmount(100);
            response.setFreeflow("FC");

            List<String> dataSet = new ArrayList<String>();
            dataSet.add("Main Menu");
            dataSet.add("1.Sub Menu 01");
            dataSet.add("2.Sub Menu 02");
            dataSet.add("3.Exit");

            Node mainNode = new Node();
            mainNode.setTag("MN");
            mainNode.setDescription("Main Menu");
            mainNode.setAttributeList(dataSet);

            //save request to database
            requestDao.save(request);

            response.setResponse_Message(mainNode);


        }else if("1".equals(request.getInput())){
            response.setCharge("Y");
            response.setAmount(100);
            response.setFreeflow("FC");

            List<String> dataSet = new ArrayList<String>();
            dataSet.add("Sub Menu 01");
            dataSet.add("1.SN_01 Sample Data 01");
            dataSet.add("2.SN_01 Sample Data 02");
            dataSet.add("3.Main Menu");
            dataSet.add("4.Exit");

            Node subMenuNode_01 = new Node();
            subMenuNode_01.setTag("SN_01");
            subMenuNode_01.setDescription("Sub Menu 01");
            subMenuNode_01.setAttributeList(dataSet);

            requestDao.save(request);

            response.setResponse_Message(subMenuNode_01);

        }else if("2".equals(request.getInput())){
            response.setCharge("Y");
            response.setAmount(100);
            response.setFreeflow("FC");

            List<String> dataSet = new ArrayList<String>();
            dataSet.add("Sub Menu 02");
            dataSet.add("1.SN_02 Sample Data 01");
            dataSet.add("2.SN_02 Sample Data 02");
            dataSet.add("3.Main Menu");
            dataSet.add("4.Exit");

            Node subMenuNode_02 = new Node();
            subMenuNode_02.setTag("SN_02");
            subMenuNode_02.setDescription("Sub Menu 02");
            subMenuNode_02.setAttributeList(dataSet);

            requestDao.save(request);

            response.setResponse_Message(subMenuNode_02);

        }else if("3".equals(request.getInput())){

            response.setCharge("N");
            response.setAmount(0);
            response.setFreeflow("FB");

            List<String> dataSet = new ArrayList<String>();
            dataSet.add("EXIT");
            dataSet.add("Service Terminated");

            Node exitNode = new Node();
            exitNode.setTag("EN");
            exitNode.setDescription("EXIT");
            exitNode.setAttributeList(dataSet);

            requestDao.save(request);

            response.setResponse_Message(exitNode);

        }else{

            response.setCharge("N");
            response.setAmount(0);
            response.setFreeflow("FB");

            List<String> dataSet = new ArrayList<String>();
            dataSet.add("INVALID");
            dataSet.add("Invalid Input");

            Node invalidNode = new Node();
            invalidNode.setTag("IN");
            invalidNode.setDescription("INVALID");
            invalidNode.setAttributeList(dataSet);

            requestDao.save(request);

            response.setResponse_Message(invalidNode);

        }


        return  response;
    }

    public CleanUpResponse testCleanRequest(CleanUpRequest request){
        CleanUpResponse response=new CleanUpResponse();
        // response.setRequestId(request.getRequestId());
        response.setResponse("SUCCESS CLEANUP REQUEST");


        return  response;
    }



}