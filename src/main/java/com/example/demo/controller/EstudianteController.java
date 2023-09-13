package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@GetMapping("/insertarEstudiante")
	private String insertarEstudiante(Estudiante estudiante) {
		return "vistaNuevoEstudiante";
	}
	
	@PostMapping("/insertar")
	private String insertar(Estudiante estudiante) {
		this.estudianteService.insertar(estudiante);
		return "redirect:/estudiantes/insertarEstudiante";
	}

}
