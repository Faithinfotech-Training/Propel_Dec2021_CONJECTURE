package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conjecture.demo.dao.ILabtestRepositary;
import com.conjecture.demo.entity.Labtest;


@Service
public class LabtestImplementation implements ILabtestService {
	
	@Autowired
	private ILabtestRepositary LabtestRepo;

	//list
	@Override
	public List<Labtest> getLabtest() {
		
		return (List<Labtest>) LabtestRepo.findAll();
	}

	//insert or Update
	@Override
	public void saveLabtest(Labtest labtest) {
		LabtestRepo.save(labtest);
		
	}

	//get labtest by id
	@Override
	public Optional<Labtest> getLabtest(int id) {
		
		return LabtestRepo.findById(id);
	}

	//delete labtest
	@Override
	public void deleteLabtest(int id) {
		LabtestRepo.deleteById(id);
		
	}

	@Override
	public List<Labtest> getLabtestByLabtestName(String name) {
		
		return (List<Labtest>) LabtestRepo.findByLabtestName(name);
	}

	

}
