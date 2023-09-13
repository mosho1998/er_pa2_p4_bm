package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Materia;
import com.example.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService{

	@Autowired
	private IMateriaRepository iMateriaRepository;
	
	
	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		materia.setNumeroEstudiantes(0);
		this.iMateriaRepository.insertar(materia);
	}

	@Override
	public Materia buscarCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.iMateriaRepository.buscarCodigo(codigo);
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.iMateriaRepository.actualizar(materia);
	}

}
