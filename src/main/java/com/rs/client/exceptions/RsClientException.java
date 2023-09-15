package com.rs.client.exceptions;

public class RsClientException extends RuntimeException {
    private ExceptionType type;
    private String message;
    private Integer clientStatusCode;

    public RsClientException(String message, ExceptionType type, Integer clientStatusCode) {
        super(type.getKeyWord());
        this.type = type;
        this.message = message;
        this.clientStatusCode = clientStatusCode;
    }
}
