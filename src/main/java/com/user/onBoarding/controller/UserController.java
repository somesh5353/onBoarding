package com.user.onBoarding.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.onBoarding.model.UserModel;
import com.user.onBoarding.model.UserResponse;
import com.user.onBoarding.resolve.MyException;
import com.user.onBoarding.service.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userservice;


	@GetMapping(value = "/user/id/{nticid}")
	public @ResponseBody Optional<UserModel> getUserById(@PathVariable("nticid") Integer nticid) throws MyException {

		Optional<UserModel> user = userservice.findById(nticid);
		if (user!=null)
			return user;
		else
			return null;

	}

	@GetMapping(value = "/user/name/{firstName}")
	public @ResponseBody UserResponse getUserByFirstName(@PathVariable("firstName") String firstName) throws MyException {

		UserModel user = userservice.findByfirstName(firstName);
		
		log.info("User retrive Succesfully"+ user);

		UserResponse userResp = new UserResponse();
		if (user!=null) {
			
			userResp.setUser(user);
			userResp.setMessage("success");
			 return userResp;
		}
		
		else
			userResp.setMessage("Not found");
		return userResp;

	}
	
	@ExceptionHandler({MyException.class})
	public UserResponse handleException(MyException ex)
	{
		log.error("Error in fetching Data");
		UserResponse userResp = new UserResponse();
		userResp.setMessage(ex.getMessage());
	    return userResp;
	} 
}
