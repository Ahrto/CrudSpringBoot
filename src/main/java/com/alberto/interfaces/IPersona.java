package com.alberto.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.alberto.modelo.Persona;

public interface IPersona extends CrudRepository<Persona, Integer>{

}
