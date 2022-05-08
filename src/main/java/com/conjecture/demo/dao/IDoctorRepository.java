package com.conjecture.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conjecture.demo.entity.Doctor;

@Repository
public interface IDoctorRepository extends CrudRepository<Doctor, Integer> {

}
