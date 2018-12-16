package com.mx.company.huit.demoUser.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.company.huit.demoUser.modelo.User;
import com.mx.company.huit.demoUser.repository.UserRepository;
import com.mx.company.huit.demoUser.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	public User findById(Long id) {
		return userRepository.findUserById(id);
	}

	public User findByName(String name) {
		return userRepository.findByUsername(name);
	}

	public void saveUser(User user) {
		userRepository.save(user);
	}

	public void updateUser(User user) {
		userRepository.save(user);
	}

	public void deleteUserById(Long id) {
		userRepository.deleteById(id);

	}

	public Boolean isUserExist(User user) {
		return findByName(user.getUsername()) != null;
	}

	public void deleteAllUsers() {
		userRepository.deleteAll();
	}

}
