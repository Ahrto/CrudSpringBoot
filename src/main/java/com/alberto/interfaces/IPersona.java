package com.alberto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alberto.modelo.Persona;

// Anotacion que indica que es un repositorio
@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
