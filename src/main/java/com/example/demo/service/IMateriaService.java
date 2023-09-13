package com.example.demo.service;

import com.example.demo.modelo.Materia;

public interface IMateriaService {

	public void insertar(Materia materia);	
	public Materia buscarCodigo(String codigo);
	public void actualizar(Materia materia);
}
