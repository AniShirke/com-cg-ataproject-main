package com.cg.ataproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ataproject.model.User;

import com.cg.ataproject.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired(required = true)
	UserService userService;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	// http://localhost:9999/user/user_Registation
		@PostMapping("/user_Registation")
		public User userRegistation(@RequestBody User user) {
			LOG.info(user.toString());
			return userService.userRegistation(user);
		}


}


