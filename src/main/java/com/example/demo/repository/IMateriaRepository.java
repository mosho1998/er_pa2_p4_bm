package com.example.demo.repository;

import com.example.demo.modelo.Materia;

public interface IMateriaRepository {
	public void insertar(Materia materia);	
	public Materia buscarCodigo(String codigo);
	public void actualizar(Materia materia);
}
