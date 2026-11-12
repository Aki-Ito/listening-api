package com.example.listening_api.exception;

public final class FetchDataException extends AppException {

    public FetchDataException(String message) {
        super(message);
    }

    public FetchDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
