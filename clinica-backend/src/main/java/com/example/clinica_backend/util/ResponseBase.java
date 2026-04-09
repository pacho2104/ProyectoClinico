package com.example.clinica_backend.util;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseBase<T> {

    private boolean success;
    private List<String> errors;
    private String message;
    private T data;

    public static <T> ResponseBase<T> ok(T data) {
        return ResponseBase.<T>builder()
                .success(true)
                .message("Operación exitosa")
                .data(data)
                .build();
    }

    public static <T> ResponseBase<T> ok(String message, T data) {
        return ResponseBase.<T>builder()
                .success(true)
                .message(message)
                .data(data)
                .build();
    }

    public static <T> ResponseBase<T> error(String message) {
        return ResponseBase.<T>builder()
                .success(false)
                .message(message)
                .build();
    }

    public static <T> ResponseBase<T> error(List<String> errors) {
        return ResponseBase.<T>builder()
                .success(false)
                .errors(errors)
                .build();
    }

}
