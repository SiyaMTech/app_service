package com.netcracker.userservice.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("Resource Not found exception");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

}