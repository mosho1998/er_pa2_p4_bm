package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDTO> reporteDTO() {
		TypedQuery<MatriculaDTO> myQuery = this.entityManager.createQuery(
				"SELECT NEW com.example.demo.modelo.dto.MatriculaDTO(m.materia.nombre, m.estudiante.apellido, m.estudiante.cedula, m.materia.codigo, m.fechaMatricula) m FROM Matricula m",
				MatriculaDTO.class);
		
	

		return myQuery.getResultList();
	}

}
