package com.fiap.myapp.exceptions;

public class CustomException extends RuntimeException {

    // Construtor que aceita uma mensagem
    public CustomException(String message) {
        super(message); // Chama o construtor da classe RuntimeException
    }

    // Construtor opcional para aceitar mensagem e causa
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
