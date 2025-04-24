package com.pragma.reto2.ms_persona.infrastructure.adapters.out.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "personas")
public class PersonaEntity {
    @Id
    private Long id;
    private String documentNumber;
    private String name;
    private String email;
}
