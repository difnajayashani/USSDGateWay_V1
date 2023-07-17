package com.controller;

import com.model.CleanUpRequest;
import com.model.CleanUpResponse;
import com.model.USSDDynRequest;
import com.model.USSDDynResponse;
import com.service.USSDRestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mainapp")
public class RestTempController {

    @Autowired
    USSDRestServiceImpl service;

  /**  @GetMapping("/{userid}/{password}/{MSISDN}/{MSC}/{input}")
    public USSDDynResponse testControllerMethod(@PathVariable String userid,
                                                @PathVariable String password,
                                                @PathVariable String MSISDN,
                                                @PathVariable String MSC,
                                                @PathVariable String input){
        USSDDynRequest request=new USSDDynRequest();
        request.setRequestId("1");
        request.setUserid(userid);
        request.setPassword(password);
        request.setMSISDN(MSISDN);
        request.setMSC(MSC);
        request.setInput(input);

        return service.testRequest(request);
    }**/

    @GetMapping("/normalRequest")
    public USSDDynResponse testControllerMethod(@RequestParam("userid")String userid,@RequestParam("password")String password,
                                                @RequestParam("MSISDN")String MSISDN,@RequestParam("MSC")String MSC,
                                                @RequestParam("input")String input){

        USSDDynRequest request=new USSDDynRequest();
        request.setUserid(userid);
        request.setPassword(password);
        request.setMSISDN(MSISDN);
        request.setMSC(MSC);
        request.setInput(input);

        return service.testNormalRequest(request);
    }

    @GetMapping("/cleanRequest")
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
    }





}