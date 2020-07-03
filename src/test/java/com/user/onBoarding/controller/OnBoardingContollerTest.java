package com.user.onBoarding.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.user.onBoarding.model.UserModel;
import com.user.onBoarding.model.UserResponse;
import com.user.onBoarding.resolve.MyException;
import com.user.onBoarding.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class OnBoardingContollerTest {

	@Mock
	UserService userservice;

	@InjectMocks
	UserController userController;
//	
//	@BeforeAll
//	public static void init() {
//		MockitoAnnotations.initMocks(this);
//	}

	@Test
	public void testgetUserByFirstName() throws MyException {

		UserModel user = new UserModel();
		user.setFirstName("Debasish");
		when(userservice.findByfirstName("Debasish")).thenReturn(user);

		UserResponse userResp = userController.getUserByFirstName("Debasish");

		assertEquals(userResp.getUser().getFirstName(), "Debasish");
	}
	
	@Test
	public void testgetUserByFirstNameNotFound() throws MyException {

		when(userservice.findByfirstName("Debasish")).thenReturn(null);

		UserResponse userResp = userController.getUserByFirstName("Debasish");

		assertThat(userResp.getMessage().equals("Not Found"));
	}
	
	
	@Test
	public void testgetUserById() throws MyException {

		
		UserModel user = new UserModel();
		user.setNticId(12345);
		user.setFirstName("Debasish");
		
	    Optional<UserModel> userOpt = Optional.of(user);
		
		when(userservice.findById(12345)).thenReturn(userOpt);

		Optional<UserModel> userResp = userController.getUserById(12345);

		assertThat(userResp.get().getFirstName().equals("Debasish"));
	}

	@Test
	public void testgetUserByIdNotFound() throws MyException {

		when(userservice.findById(2345)).thenReturn(null);

		Optional<UserModel> userResp = userController.getUserById(2345);

		assertEquals(userResp,null);
	}
	
	/*
	 * @Test(expected = MyException.class) public void testgetUserByIdException()
	 * throws MyException {
	 * 
	 * when(userservice.findById(Mockito.anyInt())).thenThrow(new
	 * MyException("Exception")); userController.getUserById(2345); }
	 * 
	 * @Test(expected = MyException.class) public void testgetUserByNameException()
	 * throws MyException {
	 * 
	 * when(userservice.findByfirstName(Mockito.anyString())).thenThrow(new
	 * MyException("Exception")); userController.getUserByFirstName("Abhi"); }
	 */
	
	
}
