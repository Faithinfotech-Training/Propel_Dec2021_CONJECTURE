package com.conjecture.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.conjecture.demo.entity.Labtest;


public interface ILabtestRepositary extends CrudRepository<Labtest, Integer> {
	
	@Query("FROM Labtest WHERE labtestName LIKE %?1%")
	public List<Labtest> findByLabtestName(String name);

}
