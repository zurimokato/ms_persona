package com.pragma.reto2.ms_persona.application.ports.output;

import com.pragma.reto2.ms_persona.domain.model.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaOutPutPort {
    Persona save(Persona persona);
    List<Persona>findAll();
    Page<Persona>findPersonas(Pageable pageable);
    Persona findById(Long id);

}
