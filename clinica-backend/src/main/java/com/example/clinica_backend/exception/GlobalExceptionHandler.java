package com.example.clinica_backend.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.clinica_backend.util.ResponseBase;

@ControllerAdvice
public class GlobalExceptionHandler {

    
    // Manejar cualquier otra excepción
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseBase<Object>> handleGenericException(Exception ex) {

        ResponseBase<Object> response = ResponseBase.error("Error interno del servidor");

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ResponseBase<Object>> handleBusiness(BusinessException ex) {
        return ResponseEntity
                .badRequest()
                .body(ResponseBase.error(ex.getMessage()));
    }

     @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseBase<Object>> handleValidation(MethodArgumentNotValidException ex) {

        List<String> errors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(error -> error.getDefaultMessage())
                .toList();

        return ResponseEntity
                .badRequest()
                .body(ResponseBase.error(errors));
    }


}
