package com.conjecture.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.conjecture.demo.entity.Appointment;

@Repository
public interface IAppointmentRepository extends CrudRepository<Appointment, Integer> {

}
