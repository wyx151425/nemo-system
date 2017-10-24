package com.rumofuture.nemo.model.dto.response;

public class Response<T> {

    private int statusCode;
    private String message;
    private T object;

    private static final int SUCCESS = 700;
    private static final int FAILED = 707;

    public Response() {

    }

    public Response(boolean success, String message) {
        if (success) {
            this.statusCode = SUCCESS;
        } else {
            this.statusCode = FAILED;
        }
        this.message = message;
        this.object = null;
    }

    public Response(boolean success, T object) {
        if (success) {
            this.statusCode = SUCCESS;
        } else {
            this.statusCode = FAILED;
        }
        this.message = null;
        this.object = object;
    }

    public Response(boolean success, String message, T object) {
        if (success) {
            this.statusCode = SUCCESS;
        } else {
            this.statusCode = FAILED;
        }
        this.message = message;
        this.object = object;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(boolean success) {
        if (success) {
            statusCode = SUCCESS;
        } else {
            statusCode = FAILED;
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
