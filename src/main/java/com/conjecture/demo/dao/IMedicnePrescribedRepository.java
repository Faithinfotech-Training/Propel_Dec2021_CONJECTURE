package com.conjecture.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conjecture.demo.entity.MedicnePrescribed;

@Repository
public interface IMedicnePrescribedRepository extends CrudRepository<MedicnePrescribed, Integer> {

}
