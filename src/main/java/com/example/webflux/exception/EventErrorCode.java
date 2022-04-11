package com.example.webflux.exception;


public enum EventErrorCode {



    BROKEN_FORMAT_DATEDATA(500, "시작 시간이 종료시간보다 작아야 합니다"),

    BOARD_NOT_FOUND(1002, "게시글을 찾을 수 없습니다.");

    private int errorCode;
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    EventErrorCode(int errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}