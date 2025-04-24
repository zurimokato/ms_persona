package com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class GenericResponse {
    private Boolean success;
    private LocalDate date;
    private HttpStatus code;
    private String message;
    private Object content;
    private PageResponse page;


    public static GenericResponse getSuccessInstance(){
        return GenericResponse.builder()
                .success(true)
                .message("Transaccion ejecutada exitosamente")
                .code(HttpStatus.OK)
                .build();
    }

    public static GenericResponse getErrorInstance(){
        return GenericResponse.builder()
                .success(false)
                .code(HttpStatus.INTERNAL_SERVER_ERROR)
                .build();
    }



}
