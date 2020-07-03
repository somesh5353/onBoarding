package com.user.onBoarding.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.onBoarding.model.UserModel;
import com.user.onBoarding.repository.UserRepository;
import com.user.onBoarding.resolve.MyException;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userepo;

	public Optional<UserModel> findById(Integer nticid) throws MyException{
		return userepo.findById(nticid);

	}

	public UserModel findByfirstName(String firstName) throws MyException {
		return userepo.findByfirstName(firstName);

	}

}
