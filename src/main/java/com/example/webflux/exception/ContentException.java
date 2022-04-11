package com.example.webflux.exception;


import org.springframework.validation.Errors;

public class ContentException extends RuntimeException {
    private int eventErrorCode;
    private String detailMessage;


    public ContentException(int code, String message){
        super();
    }


    public int getEventErrorCode() {
        return eventErrorCode;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public Errors getBindingResult() {
        return null;
    }

}