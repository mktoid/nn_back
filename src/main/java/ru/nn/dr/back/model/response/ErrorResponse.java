package ru.nn.dr.back.model.response;

public record ErrorResponse(
        String message,
        Class exceptionClass,
        String cause
) {
}
