package com.example.demo.modelo.dto;

import java.time.LocalDateTime;

public class MatriculaDTO {

	
	public MatriculaDTO() {
		
	}
	
	private String nombreMateria;
	private String apellido;
	private String cedula;
	private String codigoMateria;
	private LocalDateTime fechaMtricula;
	
	public MatriculaDTO(String nombreMateria, String apellido, String cedula, String codigoMateria,
			LocalDateTime fechaMtricula) {
		super();
		this.nombreMateria = nombreMateria;
		this.apellido = apellido;
		this.cedula = cedula;
		this.codigoMateria = codigoMateria;
		this.fechaMtricula = fechaMtricula;
	}
	
	
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCodigoMateria() {
		return codigoMateria;
	}
	public void setCodigoMateria(String codigoMateria) {
		this.codigoMateria = codigoMateria;
	}
	public LocalDateTime getFechaMtricula() {
		return fechaMtricula;
	}
	public void setFechaMtricula(LocalDateTime fechaMtricula) {
		this.fechaMtricula = fechaMtricula;
	}
	
	
	
	
}
