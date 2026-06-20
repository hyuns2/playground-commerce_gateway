package io.playground.gateway.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GlobalErrorDto {
    private String code;
    private String message;
    private String detail;

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
