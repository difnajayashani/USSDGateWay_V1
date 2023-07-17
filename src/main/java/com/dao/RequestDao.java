package com.dao;

import com.model.USSDDynRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestDao extends CrudRepository<USSDDynRequest, String> {

}
