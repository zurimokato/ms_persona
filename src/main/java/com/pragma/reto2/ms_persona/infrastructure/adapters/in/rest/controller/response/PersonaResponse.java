package com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PersonaResponse {
    private Long id;
    private String documentNumber;
    private String name;
    private String email;
}
