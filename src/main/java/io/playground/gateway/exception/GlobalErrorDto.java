package io.playground.gateway.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GlobalErrorDto {
    private final String code;
    private final String message;
    private final String detail;

    public static GlobalErrorDto of(String code,
                                    String message,
                                    String detail) {
        return new GlobalErrorDto(code, message, detail);
    }

    public static GlobalErrorDto from(BusinessException exception) {
        return new GlobalErrorDto(
                exception.getCode(),
                exception.getMessage(),
                exception.getDetail()
        );
    }
}
