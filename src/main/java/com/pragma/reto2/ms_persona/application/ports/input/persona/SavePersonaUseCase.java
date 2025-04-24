package com.pragma.reto2.ms_persona.application.ports.input.persona;

import com.pragma.reto2.ms_persona.domain.model.Persona;

public interface SavePersonaUseCase {

    Persona save(Persona persona);
}
