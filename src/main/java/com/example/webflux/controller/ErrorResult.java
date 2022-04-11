package com.example.webflux.controller;

import org.springframework.http.HttpStatus;

public class ErrorResult {
    private int code;
    private String message;
    private HttpStatus status;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public ErrorResult() {
        this.code = code;
        this.message = message;
    }
}
