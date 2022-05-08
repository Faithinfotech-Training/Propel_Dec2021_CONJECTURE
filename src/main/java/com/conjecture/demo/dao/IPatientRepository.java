package com.conjecture.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conjecture.demo.entity.Patient;

@Repository
public interface IPatientRepository extends CrudRepository<Patient, Integer> {

}
