package com.example.clinica_backend.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.clinica_backend.util.ResponseBase;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Manejar RuntimeException (como tus errores de login)
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ResponseBase<Object>> handleRuntimeException(RuntimeException ex) {

        ResponseBase<Object> response = ResponseBase.error(ex.getMessage());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

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

}
