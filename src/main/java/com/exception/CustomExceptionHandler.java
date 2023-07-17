package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice //specifically designed for exception handling
public class CustomExceptionHandler {

    //this method automatically gets invoked
    @ExceptionHandler(ServletRequestBindingException.class) //exception to throw when header is missing
    public ResponseEntity<Object> handleHeaderException(Exception ex, WebRequest request){

        List<String> details= new ArrayList<String>();
        details.add(ex.getLocalizedMessage());//give whatever details are present about the exception
        ErrorResponse response=new ErrorResponse("Header is missing",details);
        return new ResponseEntity(response,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class) //exception to throw other than header
    public ResponseEntity<Object> handleAllException(Exception ex, WebRequest request){

        List<String> details= new ArrayList<String>();
        details.add(ex.getLocalizedMessage());//give whatever details are present about the exception
        ErrorResponse response=new ErrorResponse("Server SIde Error",details);
        return new ResponseEntity(response,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
