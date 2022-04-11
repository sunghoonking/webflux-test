package com.example.webflux.exception;

public class NotFoundException extends RuntimeException {

    public final static int BROKEN_FORMAT_DATEDATA = 500;


    private final int code;

    public int getCode() {
        return code;
    }

    public NotFoundException(int code) {
        this.code = code;
    }

    public NotFoundException(int code, String message) {
        super(message);
        this.code = code;
    }
}



