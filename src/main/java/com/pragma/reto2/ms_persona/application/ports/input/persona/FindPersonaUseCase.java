package com.pragma.reto2.ms_persona.application.ports.input.persona;

import com.pragma.reto2.ms_persona.domain.model.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FindPersonaUseCase {
    List<Persona> findAll();
    Page<Persona> findPersonas(Pageable pageable);
    Persona findById(Long id);

}
