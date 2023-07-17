package com.service;

import com.model.USSDDynRequest;
import com.model.USSDDynResponse;

public interface USSDRestService {

    public USSDDynResponse testNormalRequest(USSDDynRequest request);
}
