package com.mx.company.huit.demoUser.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mx.company.huit.demoUser.modelo.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String name);
	
	@Query("SELECT u FROM User u WHERE u.id = :id")
	User findUserById(@Param("id") Long id);
}
