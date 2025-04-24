package com.pragma.reto2.ms_persona.infrastructure.adapters.out.database.mappers;

import com.pragma.reto2.ms_persona.domain.model.Persona;
import com.pragma.reto2.ms_persona.infrastructure.adapters.out.database.entities.PersonaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaEntityMapper {
    Persona toDomain(PersonaEntity source);
    PersonaEntity toEntity(Persona source);

}
