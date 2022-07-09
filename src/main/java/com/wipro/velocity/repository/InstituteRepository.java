package com.wipro.velocity.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wipro.velocity.model.InstituteModel;

//@RepositoryRestResource(collectionResourceRel = "Instituteregisterdata", 
//path = "Instituteregisterdata")
public interface InstituteRepository extends MongoRepository<InstituteModel,String> {
public Optional<InstituteModel> findByEmail(String email);
}
