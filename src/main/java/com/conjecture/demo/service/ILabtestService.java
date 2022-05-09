package com.conjecture.demo.service;

import java.util.List;
import java.util.Optional;

import com.conjecture.demo.entity.Labtest;



public interface ILabtestService {
	
	//list
	public List<Labtest > getLabtest();
	
	//insert/update
	public void saveLabtest(Labtest labtest);
	
	//search by id
	public Optional <Labtest> getLabtest(int id);
	
	//delete
	public void deleteLabtest(int id);
	
	//find by LabtestName--Custom methods
	public List<Labtest> getLabtestByLabtestName(String name);
	
	//get all labtest using viewModel--InnerJoin
	

}
