package com.conjecture.demo.service;

import com.conjecture.demo.entity.User;

public interface IUserService {

	//Custom Method using JPQL-in User Repository
		public User findUserByNameAndPassword(String userName, String password);
}
