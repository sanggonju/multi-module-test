package com.withever.web.user.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.withever.model.User;
import com.withever.web.user.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/save",  method=RequestMethod.GET)
	public User saveUser() throws Exception {
		User user = new User();
		user.setId("2222");
		user.setName("3333");
		return userService.save(user);		
	}
}
