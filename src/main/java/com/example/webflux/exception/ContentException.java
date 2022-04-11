package com.example.webflux.exception;


import org.springframework.validation.Errors;

public class ContentException extends RuntimeException {
    private EventErrorCode eventErrorCode;
    private String detailMessage;


    public ContentException(){
        super();
    }

    public ContentException(EventErrorCode eventErrorCode){
        super(eventErrorCode.getMessage());
        this.eventErrorCode = eventErrorCode;
        this.detailMessage = eventErrorCode.getMessage();
    }

    public EventErrorCode getEventErrorCode() {
        return eventErrorCode;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public Errors getBindingResult() {
        return null;
    }
}