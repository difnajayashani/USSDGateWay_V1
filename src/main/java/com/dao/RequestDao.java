package com.dao;

import com.model.USSDDynRequest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**@Repository
public interface RequestDao extends CrudRepository<USSDDynRequest, String> {

   /** @Modifying
    @Query("select r from USSDDynRequest r where r.Session_Id = :sessionId order by  r.id desc")
    public List<USSDDynRequest> searchBySessionId(@Param("sessionId") String sessionId);

}**/
