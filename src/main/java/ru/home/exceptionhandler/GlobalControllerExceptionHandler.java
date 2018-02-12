package ru.home.exceptionhandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
    @ExceptionHandler
    public String defaultErrorHandler(HttpServletRequest request, Exception exception) {
       return "error";
    }
}