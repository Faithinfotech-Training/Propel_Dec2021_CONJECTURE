package com.conjecture.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conjecture.demo.entity.Consultation;

@Repository
public interface IConsultationRepositoty extends CrudRepository<Consultation, Integer> {
	
	//custom Methods using JPQL
	//Custom method using multiple Tables
//	@Query("SELECT new com.ashwin.demo.dto.ConsultPatientDTO()"
//			+ "FROM Consultation e INNER JOIN e.department d WHERE consultationID")
//	public List<ConsultPatientDTO> findAllDTOPatients();

}
