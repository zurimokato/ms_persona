package com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PersonaRequest {

    private Long id;
    @NotBlank
    @NotEmpty
    private String documentNumber;
    @NotBlank
    @NotEmpty
    private String name;
    @NotEmpty
    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "El correo no tiene un formato válido")
    private String email;
}
