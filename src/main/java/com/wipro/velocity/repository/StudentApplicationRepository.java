package com.wipro.velocity.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.model.StudentApplication;

public interface StudentApplicationRepository extends MongoRepository<StudentApplication, String> {
	

}
