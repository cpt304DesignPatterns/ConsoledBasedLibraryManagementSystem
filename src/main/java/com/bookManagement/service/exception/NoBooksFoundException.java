package com.bookManagement.service.exception;

public class NoBooksFoundException extends RuntimeException {
    public NoBooksFoundException(String message) {
        super(message);
    }
}
