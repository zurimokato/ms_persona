package com.pragma.reto2.ms_persona.domain.model;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Persona {
    private Long id;
    private String documentNumber;
    private String name;
    private String email;

}
