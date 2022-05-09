package com.conjecture.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conjecture.demo.entity.MedicnePrescribed;

@Repository
public interface IMedicnePrescribedRepository extends CrudRepository<MedicnePrescribed, Integer> {
	
	@Query("FROM MedicnePrescribed WHERE consultationID LIKE ?1")
	public List<MedicnePrescribed> medPrescribedByConsultId(Integer Id);

}
