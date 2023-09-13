package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.MatriculaVista;
import com.example.demo.modelo.dto.MatriculaDTO;
import com.example.demo.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private IMatriculaService iMatriculaService;
	
	@GetMapping("/insertarMatricula")
	private String instarMatricula(MatriculaVista matriculaVista) {
		
		
		return "vistaNuevaMatricula";
	}
	
	
	@PostMapping("/insertar")
	private String insertar(MatriculaVista matriculaVista) {
		this.iMatriculaService.matricular(matriculaVista);
		return "redirect:/matriculas/reporteMatricula";
	}
	
	
	@GetMapping("/reporteMatricula")
	public String reporteMatricula(Model modelo) {
		List<MatriculaDTO> reportes = this.iMatriculaService.reporteDTO();
		modelo.addAttribute("reportes", reportes);
		return "reporteMatricula";
	}
}
