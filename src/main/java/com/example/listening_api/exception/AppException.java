package com.example.listening_api.exception;

import org.apache.coyote.BadRequestException;

// sealed と permits は、「この4つ以外に、この親を継承するクラスは作れない」という宣言
public abstract sealed class AppException extends RuntimeException permits BusinessException, BadRequestException, UnauthorizedException, FetchDataException {
    protected AppException(String message) {
        super(message);
    }

    protected AppException(String message, Throwable cause) {
        super(message, cause);
    }
}

