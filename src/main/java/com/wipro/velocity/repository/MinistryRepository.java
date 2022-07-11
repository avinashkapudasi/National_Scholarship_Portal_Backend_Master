package com.wipro.velocity.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.model.MinistryModel;
import com.wipro.velocity.model.StudentModel;

public interface MinistryRepository extends MongoRepository<MinistryModel, String> {

	public Optional<MinistryModel> findByMinistryId(String id);
	
	

}
