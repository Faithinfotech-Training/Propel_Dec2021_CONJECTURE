package com.conjecture.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conjecture.demo.entity.LabTestPrescribed;

@Repository
public interface ILabTestPrescribedRepository extends CrudRepository<LabTestPrescribed, Integer> {

	@Query("FROM LabTestPrescribed WHERE consultationID LIKE ?1")
	public List<LabTestPrescribed> testPrescribedByConsultId(Integer Id);

}
