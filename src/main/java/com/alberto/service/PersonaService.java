package com.alberto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alberto.interfaceService.IpersonaService;
import com.alberto.interfaces.IPersona;
import com.alberto.modelo.Persona;

// Anotacion que indica que es un servicio
@Service
public class PersonaService implements IpersonaService{
	
//	Variable de la interfaz IPersona
	@Autowired
	private IPersona data;

	@Override
	public List<Persona> listar() {
//		Metodo para listar (FindAll)
		return (List<Persona>) data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
//		Metodo para buscar por id
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res = 0;
		Persona persona = data.save(p);
		if (!persona.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
