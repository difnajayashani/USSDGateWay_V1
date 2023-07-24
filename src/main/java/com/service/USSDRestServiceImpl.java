package com.service;

import com.dao.RequestDao;
import com.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class USSDRestServiceImpl implements  USSDRestService {

    @Autowired
    private RequestDao requestDao;

    public USSDDynResponse testNormalRequest2(String userid,String password,String MSISDN,String MSC,String input,
                                             String Session_Id, String New_Request,String status,String clean,
                                             String error_tag){

        USSDDynRequest request=new USSDDynRequest();

        USSDDynResponse response=new USSDDynResponse();

        Date date = new Date();
        request.setTimeStamp(date);

        if("New_Request".equals(New_Request)){

            request.setUserid(userid);
            request.setPassword(password);
            request.setMSISDN(MSISDN);
            request.setMSC(MSC);
            request.setNew_Request(New_Request);
            request.setSession_Id(Session_Id);
            request.setInput(input);
            request.setRequestLayer("1");

            requestDao.save(request);

            String responseMessage="Main Menu\r\n1.Sub Menu 01\r\n2.Sub Menu 02\r\n3.Exit";
            response.setCharge("Y");
            response.setAmount("100");
            response.setFreeflow("FC");
            response.setResponse_Message(responseMessage);


        }else if("clean".equals(clean)){

            String responseMessage="CLean Request SUCCESS";
            response.setCharge("Y");
            response.setAmount("100");
            response.setFreeflow("FC");
            response.setResponse_Message(responseMessage);



        }else {

            List<USSDDynRequest> requestsPerSession= requestDao.searchBySessionId(Session_Id);
            String currentLayer= requestsPerSession.get(0).getRequestLayer();
            int currentLayerInt = Integer.parseInt(currentLayer);
            currentLayerInt++;

            switch (input){

                case "1":

                    //save the request
                    request.setUserid(userid);
                    request.setPassword(password);
                    request.setMSISDN(MSISDN);
                    request.setMSC(MSC);
                    request.setSession_Id(Session_Id);
                    request.setInput(input);
                    request.setRequestLayer( Integer.toString(currentLayerInt));

                    requestDao.save(request);

                    response.setCharge("Y");
                    response.setAmount("100");
                    response.setFreeflow("FC");
                    String responseMessage1="Sub Menu 01\n1.SN_01 Sample Data 01\n2.SN_01 Sample Data 02\n3.Main Menu\n4.Exit";
                    response.setResponse_Message(responseMessage1);
                    break;

                case "2":

                    //save the request
                    request.setUserid(userid);
                    request.setPassword(password);
                    request.setMSISDN(MSISDN);
                    request.setMSC(MSC);
                    request.setSession_Id(Session_Id);
                    request.setInput(input);
                    request.setRequestLayer( Integer.toString(currentLayerInt));

                    requestDao.save(request);

                    response.setCharge("Y");
                    response.setAmount("100");
                    response.setFreeflow("FC");
                    String responseMessage2="Sub Menu 02\n1.SN_02 Sample Data 01\n2.SN_02 Sample Data 02\n3.Main Menu\n4.Exit";
                    response.setResponse_Message(responseMessage2);

                    break;

                case "3":

                    //save the request
                    request.setUserid(userid);
                    request.setPassword(password);
                    request.setMSISDN(MSISDN);
                    request.setMSC(MSC);
                    request.setSession_Id(Session_Id);
                    request.setInput(input);
                    request.setRequestLayer( Integer.toString(currentLayerInt));

                    requestDao.save(request);

                    String responseMessage3="EXIT";
                    response.setCharge("Y");
                    response.setAmount("100");
                    response.setFreeflow("FC");
                    response.setResponse_Message(responseMessage3);
                    break;

                default:
                    String responseMessage4="INVALID RESPONSE";
                    response.setCharge("N");
                    response.setAmount("0");
                    response.setFreeflow("FB");
                    response.setResponse_Message(responseMessage4);
            }

        }
        return response;

    }

    public USSDDynResponse testNormalRequest3(String userid,String password,String MSISDN,String MSC,String input,
                                              String Session_Id, String New_Request,String status,String clean,
                                              String error_tag){
        USSDDynRequest request2=new USSDDynRequest();

        USSDDynResponse response=new USSDDynResponse();

        Date date = new Date();
        request2.setTimeStamp(date);

        if("New_Request".equals(New_Request)){

            request2.setUserid(userid);
            request2.setPassword(password);
            request2.setMSISDN(MSISDN);
            request2.setMSC(MSC);
            request2.setNew_Request(New_Request);
            request2.setSession_Id(Session_Id);
            request2.setInput(input);
            request2.setRequestLayer("1");

            requestDao.save(request2);

            String responseMessage="Main Menu\r\n1.Sub Menu 01\r\n2.Sub Menu 02\r\n3.Exit";
            response.setCharge("Y");
            response.setAmount("100");
            response.setFreeflow("FC");
            response.setResponse_Message(responseMessage);


        }else if("clean".equals(clean)){

            String responseMessage="CLean Request SUCCESS";
            response.setCharge("Y");
            response.setAmount("100");
            response.setFreeflow("FC");
            response.setResponse_Message(responseMessage);



        }else {

            List<USSDDynRequest> requestsPerSession= requestDao.searchBySessionId(Session_Id);
            String currentLayer= requestsPerSession.get(0).getRequestLayer();
            int currentLayerInt = Integer.parseInt(currentLayer);
            currentLayerInt++;

            switch (input){

                case "1":

                    //save the request
                    request2.setUserid(userid);
                    request2.setPassword(password);
                    request2.setMSISDN(MSISDN);
                    request2.setMSC(MSC);
                    request2.setSession_Id(Session_Id);
                    request2.setInput(input);
                    request2.setRequestLayer( Integer.toString(currentLayerInt));

                    requestDao.save(request2);

                    response.setCharge("Y");
                    response.setAmount("100");
                    response.setFreeflow("FC");
                    String responseMessage1="Sub Menu 01\n1.SN_01 Sample Data 01\n2.SN_01 Sample Data 02\n3.Main Menu\n4.Exit";
                    response.setResponse_Message(responseMessage1);
                    break;

                case "2":

                    //save the request
                    request2.setUserid(userid);
                    request2.setPassword(password);
                    request2.setMSISDN(MSISDN);
                    request2.setMSC(MSC);
                    request2.setSession_Id(Session_Id);
                    request2.setInput(input);
                    request2.setRequestLayer( Integer.toString(currentLayerInt));

                    requestDao.save(request2);

                    response.setCharge("Y");
                    response.setAmount("100");
                    response.setFreeflow("FC");
                    String responseMessage2="Sub Menu 02\n1.SN_02 Sample Data 01\n2.SN_02 Sample Data 02\n3.Main Menu\n4.Exit";
                    response.setResponse_Message(responseMessage2);

                    break;

                case "3":

                    //save the request
                    request2.setUserid(userid);
                    request2.setPassword(password);
                    request2.setMSISDN(MSISDN);
                    request2.setMSC(MSC);
                    request2.setSession_Id(Session_Id);
                    request2.setInput(input);
                    request2.setRequestLayer( Integer.toString(currentLayerInt));

                    requestDao.save(request2);

                    String responseMessage3="EXIT";
                    response.setCharge("Y");
                    response.setAmount("100");
                    response.setFreeflow("FC");
                    response.setResponse_Message(responseMessage3);
                    break;

                default:
                    String responseMessage4="INVALID RESPONSE";
                    response.setCharge("N");
                    response.setAmount("0");
                    response.setFreeflow("FB");
                    response.setResponse_Message(responseMessage4);
            }

        }
        return response;

    }


}