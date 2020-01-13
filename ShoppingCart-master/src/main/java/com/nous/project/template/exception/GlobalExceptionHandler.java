package com.nous.project.template.exception;

import javax.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

public class GlobalExceptionHandler {
	
    

	@ExceptionHandler(BaseException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiErrorResponse productNotFound(String error) {
        return new ApiErrorResponse(500, 5001, error);
    }

    @ExceptionHandler(BaseException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrorResponse productNotPurchased(String error) {
        return new ApiErrorResponse(404, 4041,error);
    }

    @ExceptionHandler(BaseException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiErrorResponse UnknownException(String error) {
        return new ApiErrorResponse(500, 5002, error);
    }
}

