package com.user.onBoarding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.onBoarding.model.UserModel;


@Repository
public interface UserRepository extends JpaRepository<UserModel ,Integer>{
	
	 public UserModel findByfirstName( String firstName);
}
