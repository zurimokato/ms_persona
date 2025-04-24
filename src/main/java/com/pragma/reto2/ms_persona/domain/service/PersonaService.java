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
        return personaOutPutPort.findAll();
    }

    @Override
    public Page<Persona> findPersonas(Pageable pageable) {
        return personaOutPutPort.findPersonas(pageable);
    }

    @Override
    public Persona findById(Long id) {
        return personaOutPutPort.findById(id);
    }

    @Override
    public Persona save(Persona persona) {
        return personaOutPutPort.save(persona);
    }
}
