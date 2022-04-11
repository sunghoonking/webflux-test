package com.example.webflux.service;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ErrorService {



    public CommonResponse getErrorResponse(int code, String message) {
        CommonResponse response = new CommonResponse();
        response.success = false;
        response.code=code;
        response.message = message;
        return  response;
    }



}