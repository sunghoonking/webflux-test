package com.example.webflux.service;

import com.example.webflux.exception.ContentException;
import com.example.webflux.exception.EventErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApiControllerAdvice {
    private ErrorService errorService;


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors()
                .forEach(c -> errors.put(((FieldError) c).getField(), c.getDefaultMessage()));
        return ResponseEntity.badRequest().body(errors);
    }




    @ExceptionHandler(ContentException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(ContentException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors()
                .forEach(c -> errors.put(((FieldError) c).getField(), c.getDefaultMessage()));
        return ResponseEntity.badRequest().body(errors);
    }
//    @ExceptionHandler(ContentException.class)
//    public String exceptionHandler(ContentException ex){
//        String a = ex.getMessage();
//        return ex.getDetailMessage();
//    }

//    @ExceptionHandler(ContentException.class)
//    public ResponseEntity<String> handleNoSuchElementFoundException(ContentException exception)
//    {
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
//
//    }


//    @ExceptionHandler(ContentException.class)
////    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public String handleNoSuchElementFoundExceptio1n(ContentException exception) {
//        return exception.getMessage();
//
//    }
//
//
//     @ExceptionHandler(ContentException.class)
//     @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//     public ResponseEntity iii(ContentException contentException) {
//        return contentException.getMessage();
//
////
//        @ExceptionHandler(ContentException.class)
//        public ResponseEntity<String> handleNoSuchElementFound (ContentException exception)
//        {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
//
//        }
    }
