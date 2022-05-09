package com.conjecture.demo.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conjecture.demo.entity.Staff;

@Repository
public interface IStaffRepository extends CrudRepository<Staff, Integer> {

	//custom method by jpql
	@Modifying
	@Transactional
	@Query("UPDATE Staff s SET s.isActive=false WHERE staffID=?1")
	public void disableByid(Integer id);
}
