package com.alberto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.alberto.interfaceService.IpersonaService;
import com.alberto.interfaces.IPersona;
import com.alberto.modelo.Persona;

public class PersonaService implements IpersonaService{
	
//	Variable de la interfaz IPersona
	@Autowired
	private IPersona data;

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
