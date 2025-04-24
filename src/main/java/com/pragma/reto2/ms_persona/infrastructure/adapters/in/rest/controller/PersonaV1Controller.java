package com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller;

import com.pragma.reto2.ms_persona.application.ports.input.persona.FindPersonaUseCase;
import com.pragma.reto2.ms_persona.application.ports.input.persona.SavePersonaUseCase;
import com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.mapper.PersonaRestMapper;
import com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.request.PersonaRequest;
import com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.response.GenericResponse;
import com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.response.PersonaResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/personas")
public class PersonaV1Controller {

    private final SavePersonaUseCase savePersonaUseCase;
    private final FindPersonaUseCase findPersonaUseCase;
    private final PersonaRestMapper personaRestMapper;

    @GetMapping
    ResponseEntity<GenericResponse>getPersonas(){

        GenericResponse genericResponse=GenericResponse.getSuccessInstance();
        List<PersonaResponse>personaResponseList=findPersonaUseCase.findAll()
                .stream().map(personaRestMapper::torResponse).toList();
        genericResponse.setContent(personaResponseList);
        return ResponseEntity.ok(genericResponse);

    }

    @GetMapping("{id}")
    ResponseEntity<GenericResponse>getPersonasById(@PathVariable("id")Long id){
        GenericResponse genericResponse=GenericResponse.getSuccessInstance();
        PersonaResponse personaResponse=personaRestMapper.torResponse(findPersonaUseCase.findById(id));
        genericResponse.setContent(personaResponse);
        return ResponseEntity.ok(genericResponse);
    }

    @PostMapping
    ResponseEntity<GenericResponse>postPersona(@Valid @RequestBody PersonaRequest persona){
        GenericResponse genericResponse=GenericResponse.getSuccessInstance();
        PersonaResponse response=personaRestMapper.torResponse(savePersonaUseCase.save(personaRestMapper.toDomain(persona)));
        genericResponse.setContent(response);
       return ResponseEntity.ok(genericResponse);
    }
}
