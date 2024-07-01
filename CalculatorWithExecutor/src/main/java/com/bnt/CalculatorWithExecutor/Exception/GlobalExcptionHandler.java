package com.bnt.CalculatorWithExecutor.Exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExcptionHandler {

    
     Logger logger=LoggerFactory.getLogger(GlobalExcptionHandler.class);


    @ExceptionHandler(InputValidationException.class)
    public ResponseEntity<String> handleInputValidationException(InputValidationException ex) {
        logger.error("InputValidationException occurred: {}", ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }

}
