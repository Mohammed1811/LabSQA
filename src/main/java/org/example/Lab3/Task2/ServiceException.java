package org.example.Lab3.Task2;

public class ServiceException extends Exception{
    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
