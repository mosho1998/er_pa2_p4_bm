package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.MatriculaVista;
import com.example.demo.modelo.dto.MatriculaDTO;

public interface IMatriculaService {

	public void insertar(Matricula matricula);
	

	public void matricular(MatriculaVista matriculaVista);
	public List<MatriculaDTO> reporteDTO();
}
