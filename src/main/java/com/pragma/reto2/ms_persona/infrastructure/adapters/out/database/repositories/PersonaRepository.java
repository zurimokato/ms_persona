package com.pragma.reto2.ms_persona.infrastructure.adapters.out.database.repositories;

import com.pragma.reto2.ms_persona.infrastructure.adapters.out.database.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Long> {
}
