package com.service;

import com.model.CleanUpRequest;
import com.model.CleanUpResponse;
import com.model.USSDDynRequest;
import com.model.USSDDynResponse;

public interface USSDRestService {

    //public USSDDynResponse testNormalRequest(USSDDynRequest request);
    public USSDDynResponse testNormalRequest2(String userid,String password,String MSISDN,String MSC,String input,
                                             String Session_Id, String New_Request,String status,String clean,
                                             String error_tag);

    public USSDDynResponse testNormalRequest3(String userid,String password,String MSISDN,String MSC,String input,
                                              String Session_Id, String New_Request,String status,String clean,
                                              String error_tag);

    //public CleanUpResponse testCleanRequest(CleanUpRequest request);
}
