package com.example.listening_api.exception;

// sealed と permits は、「この4つ以外に、この親を継承するクラスは作れない」という宣言
public abstract sealed class AppException extends RuntimeException permits BusinessException, BadRequestException, UnauthorizedException, FetchDataException {
    // 同じパッケージ、またはそのクラスを継承したクラスの中からだけよべる
    protected AppException(String message) {
        super(message);
    }

    protected AppException(String message, Throwable cause) {
        super(message, cause);
    }
}

