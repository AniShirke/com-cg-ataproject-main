package com.cg.ataproject.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ataproject.model.User;

import com.cg.ataproject.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	UserRepository userRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	
	public User userRegistation(User user) {
		LOG.info(user.toString());
		return userRepository.save(user);
	}


}
