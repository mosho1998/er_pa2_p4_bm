package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepoImpl implements IMateriaRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(materia);
	}

	@Override
	public Materia buscarCodigo(String codigo) {
		TypedQuery<Materia> myQuery = this.entityManager.createQuery("SELECT m FROM Materia m WHERE m.codigo= :datoCodigo", Materia.class);
		myQuery.setParameter("datoCodigo", codigo);
			return myQuery.getSingleResult();
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(materia);
	}
	
}
