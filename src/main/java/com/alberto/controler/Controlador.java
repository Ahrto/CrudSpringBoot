package com.alberto.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alberto.interfaceService.IpersonaService;
import com.alberto.modelo.Persona;

// Anotacion que indica que es un Controlador
@Controller
@RequestMapping
public class Controlador {

//	Variable de IpersonaService
	@Autowired
	private IpersonaService service;

//	Anotacion necesaria en la que se indica la ruta a ejecutar
	@GetMapping("/listar")
//	Metodo para listar
	public String listar(Model model) {
//		Usamos la variable service y su metodo listar
//		Devuelve una lista de objetos Persona que llamaremos Personas
		List<Persona> personas = service.listar();
//		Con el modelo Model y la funcion .addAttribute enviamos toda la lista al index.html
//		mediante un conjunto clave-valor
		model.addAttribute("personas", personas);
//		"index" hace referencia al index.html (no es necesario indicar la extension)
		return "index";
	}

//	Metodo para agregar datos
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("persona", new Persona());
//		Retornará form para poder ir a la url donde esta el formulario para agregar informacion
		return "form";
	}

	@PostMapping("/save")
	public String save(@Validated Persona p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
//	Metodo para editar datos
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id,Model model) {
		Optional<Persona> persona = service.listarId(id);
		model.addAttribute("persona", persona);
		return "form";	
	}
	
//	Metodo para eliminar
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
		
	}

}
