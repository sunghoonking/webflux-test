package com.example.webflux.exception;


public enum EventErrorCode {


    NOT_FOUND_EVENT("이벤트를 찾지 못했습니다.", 500),

    BROKEN_FORMAT_DATEDATA("시작 시간이 종료시간보다 작아야 합니다", 500);


    public String getMessage() {
        return message;
    }
    public int getCode() {
        return code;
    }


    EventErrorCode(String message, int code) {
        this.message = message;
        this.code = code;
    }
    private final String message;


    private final int code;
}