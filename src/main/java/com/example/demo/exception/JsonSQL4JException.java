package com.example.demo.exception;

/**
 * @author eaxdev
 */
public class JsonSQL4JException extends RuntimeException {

    public JsonSQL4JException(String message) {
        super(message);
    }

    public JsonSQL4JException(String message, Throwable cause) {
        super(message, cause);
    }

}
