package com.fiap.myapp.models;

public class ExampleModel {
    private String message;
    private String recipient;

    public ExampleModel(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
