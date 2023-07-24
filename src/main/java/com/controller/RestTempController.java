package com.controller;

import com.model.CleanUpRequest;
import com.model.CleanUpResponse;
import com.model.USSDDynRequest;
import com.model.USSDDynResponse;
import com.service.USSDRestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mainapp")
public class RestTempController {

    @Autowired
    USSDRestServiceImpl service;

    @GetMapping("/normalRequest")
    public ResponseEntity<String> getControllerMethod(@RequestParam("userid")String userid, @RequestParam("password")String password,
                                                       @RequestParam("MSISDN")String MSISDN, @RequestParam(value = "MSC",required = false)String MSC,
                                                       @RequestParam(value = "input",required = false)String input,
                                                       @RequestParam("Session_Id")String Session_Id,
                                                       @RequestParam(value = "New_Request",required = false)String New_Request,
                                                       @RequestParam(value = "status",required = false)String status,
                                                       @RequestParam(value = "clean",required = false)String clean,
                                                       @RequestParam(value = "error_tag",required = false)String error_tag){



        USSDDynResponse response= service.testNormalRequest2(userid,password,MSISDN,MSC,input,Session_Id,New_Request,status,clean,error_tag);

        String amount=response.getAmount();
        String charge=response.getCharge();
        String freeFlow= response.getFreeflow();

        HttpHeaders headers = new HttpHeaders();
       // headers.add("Content-Length", "20");

        headers.add("Freeflow", freeFlow);
        headers.add("charge", charge);
        headers.add("amount",amount );

        return new ResponseEntity(response.getResponse_Message(), headers, HttpStatus.CREATED);

    }

    @PostMapping("/normalRequest")
    public ResponseEntity<String> postControllerMethod(@ModelAttribute("userid")String userid, @ModelAttribute("password")String password,
                                         @ModelAttribute("MSISDN")String MSISDN, @ModelAttribute(value = "MSC")String MSC,
                                         @ModelAttribute(value = "input")String input,
                                         @ModelAttribute("Session_Id")String Session_Id,
                                         @ModelAttribute(value = "New_Request")String New_Request,
                                         @ModelAttribute(value = "status")String status,
                                         @ModelAttribute(value = "clean")String clean,
                                         @ModelAttribute(value = "error_tag")String error_tag)  {

        USSDDynResponse response= service.testNormalRequest3(userid,password,MSISDN,MSC,input,Session_Id,New_Request,status,clean,error_tag);

        String amount=response.getAmount();
        String charge=response.getCharge();
        String freeFlow= response.getFreeflow();

        HttpHeaders headers = new HttpHeaders();
        // headers.add("Content-Length", "20");

        headers.add("Freeflow", freeFlow);
        headers.add("charge", charge);
        headers.add("amount",amount );

        return new ResponseEntity(response.getResponse_Message(), headers, HttpStatus.CREATED);
    }

   /** @GetMapping("/cleanRequest")
    public CleanUpResponse testCleanRequestMethod(@RequestParam("userid")String userid, @RequestParam("password")String password,
                                                @RequestParam("MSISDN")String MSISDN, @RequestParam("clean")String clean,
                                                @RequestParam("status")String status){

        CleanUpRequest request=new CleanUpRequest();
        request.setUserid(userid);
        request.setPassword(password);
        request.setMSISDN(MSISDN);
        request.setClean(clean);
        request.setStatus(status);

        return service.testCleanRequest(request);
    }**/





}