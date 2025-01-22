package com.example.inventory.bill.generation.Models;


import org.springframework.http.HttpStatus;

public class ResponseDTO <T>{
    private T body;
    private String message;
    private HttpStatus status;

    public ResponseDTO(T body,HttpStatus status,String message) {
        this.body = body;
        this.status = status;
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
