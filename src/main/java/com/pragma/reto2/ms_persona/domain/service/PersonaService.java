package com.pragma.reto2.ms_persona.domain.service;

import com.pragma.reto2.ms_persona.application.ports.input.persona.FindPersonaUseCase;
import com.pragma.reto2.ms_persona.application.ports.input.persona.SavePersonaUseCase;
import com.pragma.reto2.ms_persona.application.ports.output.PersonaOutPutPort;
import com.pragma.reto2.ms_persona.domain.model.Persona;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonaService implements FindPersonaUseCase, SavePersonaUseCase {

    private final PersonaOutPutPort personaOutPutPort;

    @Override
    public List<Persona> findAll() {
        return List.of();
    }

    @Override
    public Page<Persona> findPersonas(Pageable pageable) {
        return null;
    }

    @Override
    public Persona findById(Long id) {
        return null;
    }

    @Override
    public Persona save(Persona persona) {
        return null;
    }
}
