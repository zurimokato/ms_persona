package com.pragma.reto2.ms_persona.infrastructure.adapters.out.database;

import com.pragma.reto2.ms_persona.application.ports.output.PersonaOutPutPort;
import com.pragma.reto2.ms_persona.domain.model.Persona;
import com.pragma.reto2.ms_persona.infrastructure.adapters.out.database.mappers.PersonaEntityMapper;
import com.pragma.reto2.ms_persona.infrastructure.adapters.out.database.repositories.PersonaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PersonaPersistenceAdapter implements PersonaOutPutPort {
    private final PersonaRepository personaRepository;
    private final PersonaEntityMapper personaEntityMapper;

    @Override
    public Persona save(Persona persona) {

        return personaEntityMapper.toDomain(personaRepository.save(personaEntityMapper.toEntity(persona)));
    }

    @Override
    public List<Persona> findAll() {
        List<Persona>personas=personaRepository.findAll().stream().map(
                personaEntityMapper::toDomain
        ).toList();
        if(personas.isEmpty()){
            throw new EntityNotFoundException();
        }
        return personas;
    }

    @Override
    public Page<Persona> findPersonas(Pageable pageable) {
        Page<Persona>personasPage=personaRepository.findAll(pageable).map(
                personaEntityMapper::toDomain
        );
        if(personasPage.isEmpty()){
            throw new EntityNotFoundException();
        }
        return personasPage;
    }

    @Override
    public Persona findById(Long id) {
        return personaEntityMapper.toDomain(personaRepository.findById(id).orElseThrow(EntityNotFoundException::new));
    }
}
