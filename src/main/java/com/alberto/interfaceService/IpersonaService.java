package com.alberto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.alberto.modelo.Persona;

public interface IpersonaService {
	
	public List<Persona> listar();
	public Optional<Persona> listarId(int id);
	public int save(Persona p);
	public void delete(int id);

}
