package com.example.demo.modelo;

public class MatriculaVista {

	private String codigoMateria;
	
	private String cedulaEstudiante;
	
	

	public MatriculaVista(String codigoMateria, String cedulaEstudiante) {
		super();
		this.codigoMateria = codigoMateria;
		this.cedulaEstudiante = cedulaEstudiante;
	}

	public String getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public String getCedulaEstudiante() {
		return cedulaEstudiante;
	}

	public void setCedulaEstudiante(String cedulaEstudiante) {
		this.cedulaEstudiante = cedulaEstudiante;
	}
	
	
}
