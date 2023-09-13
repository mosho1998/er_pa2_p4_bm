package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Materia;
import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.MatriculaVista;
import com.example.demo.modelo.dto.MatriculaDTO;
import com.example.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private IMateriaService iMateriaService;
	
	@Autowired
	private IEstudianteService estudianteService;
	

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		
		this.iMatriculaRepository.insertar(matricula);
	}

	@Override
	public void matricular(MatriculaVista matriculaVista) {
		// TODO Auto-generated method stub
		Estudiante estudiante = this.estudianteService.buscarCedula(matriculaVista.getCedulaEstudiante());
		Materia materia = this.iMateriaService.buscarCodigo(matriculaVista.getCodigoMateria());
		
		Matricula matricula = new Matricula();
		
		matricula.setEstudiante(estudiante);
		matricula.setMateria(materia);
		matricula.setFechaMatricula(LocalDateTime.now());
		this.insertar(matricula);
		materia.setNumeroEstudiantes(materia.getNumeroEstudiantes()+1);
		this.iMateriaService.actualizar(materia);
	}

	@Override
	public List<MatriculaDTO> reporteDTO() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.reporteDTO();
	}
	
	

}
