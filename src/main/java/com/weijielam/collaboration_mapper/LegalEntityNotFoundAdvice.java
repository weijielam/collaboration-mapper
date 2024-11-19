package com.weijielam.collaboration_mapper;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class LegalEntityNotFoundAdvice {

    @ExceptionHandler(LegalEntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String legalEntityNotFoundHandler(LegalEntityNotFoundException ex) {
        return ex.getMessage();
    }
}
