package com.conjecture.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conjecture.demo.entity.LabTestPrescribed;

@Repository
public interface ILabTestPrescribedRepository extends CrudRepository<LabTestPrescribed, Integer> {

}
