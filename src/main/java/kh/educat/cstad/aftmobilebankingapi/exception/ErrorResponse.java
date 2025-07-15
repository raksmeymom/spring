package kh.educat.cstad.aftmobilebankingapi.exception;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record  ErrorResponse<T>(
        String message,
        Integer code,
        LocalDateTime timestamp,
        T details
        ){


}




