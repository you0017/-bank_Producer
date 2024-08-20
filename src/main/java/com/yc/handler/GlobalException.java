package com.yc.exception;

import com.yc.bean.JsonModel;
import com.yc.util.JmsMessageProducer;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AllException {

    @ExceptionHandler(Exception.class)
    public JsonModel exceptionHandler(Exception e) {
        JsonModel jm = new JsonModel();
        jm.setError(e.getMessage());
        return jm;
    }
}
