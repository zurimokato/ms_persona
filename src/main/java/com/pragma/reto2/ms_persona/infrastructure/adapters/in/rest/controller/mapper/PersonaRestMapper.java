package com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.mapper;

import com.pragma.reto2.ms_persona.domain.model.Persona;
import com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.request.PersonaRequest;
import com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.response.PageResponse;
import com.pragma.reto2.ms_persona.infrastructure.adapters.in.rest.controller.response.PersonaResponse;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

@Mapper(componentModel = "spring")
public interface PersonaRestMapper {
    PersonaResponse torResponse(Persona source);
    Persona toDomain(PersonaRequest personaRequest);
    PageResponse toPageResponse(Page<PersonaResponse> source);
}
