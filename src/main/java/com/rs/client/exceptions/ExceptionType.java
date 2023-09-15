package com.rs.client.exceptions;

public enum ExceptionType {
    INVALID_USERNAME_OR_PASSWORD("invalid.username.or.password", 400),
    ;


    private final String keyWord;
    private final int status;

    ExceptionType(String keyWord, int status) {
        this.keyWord = keyWord;
        this.status = status;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public int getStatus() {
        return status;
    }
}