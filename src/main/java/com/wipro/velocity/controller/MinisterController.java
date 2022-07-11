package com.wipro.velocity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.model.InstituteModel;
import com.wipro.velocity.model.MinistryModel;
import com.wipro.velocity.model.StudentApplication;
import com.wipro.velocity.model.StudentModel;
import com.wipro.velocity.repository.InstituteRepository;
import com.wipro.velocity.repository.MinistryRepository;
import com.wipro.velocity.repository.StudentApplicationRepository;
import com.wipro.velocity.repository.StudentRepository;

@RestController
@CrossOrigin(origins = "*")
public class MinisterController {


	@Autowired
	private StudentRepository stuRep;

	@Autowired
	private StudentApplicationRepository stuAppRepo;

	@Autowired
	private InstituteRepository instRepo;

	@Autowired
	private MinistryRepository miniRepo;

	@PostMapping("/loginministry")
	public Boolean loginMinister(@Validated @RequestBody MinistryModel min) throws ResourceNotFoundException {

		Boolean isLogin=false;
		String id=min.getMinistryId();
		String password=min.getPassword();

		MinistryModel minister = miniRepo.findByMinistryId(id).orElseThrow(() ->
		new ResourceNotFoundException("Unknown Ministry"));

		if(id.equals(minister.getMinistryId()) && password.equals(minister.getPassword()))
		{
			isLogin=true;
		}
		return isLogin;
	}


	@GetMapping("/Studentss")
	public List<StudentModel> getAllStudents(){
		return stuRep.findAll();
	}
	@GetMapping("/candidates/{email}")
	public ResponseEntity<StudentModel> getStudentById(@PathVariable(value="email") String email)
			throws ResourceNotFoundException
	{
		StudentModel studentModel =stuRep.findByEmail(email).
				orElseThrow(() -> new ResourceNotFoundException
						("student Not Found for this Id: "+email));

		return ResponseEntity.ok().body(studentModel);     
	}


	@GetMapping("/institutess")
	public List<InstituteModel> getAllInstitutions(){
		return instRepo.findAll();
	}
	
	@GetMapping("/studentapplicationdetails")
	  public List<StudentApplication> getStudentapplications()
	  {
	    return stuAppRepo.findAll();
	  }

	@DeleteMapping("/delete-institutes/{id}")
	public String deleteInstitution(@PathVariable String id)
	{
		instRepo.deleteById(id);
		return "institute is deleted successfully";
	}

}
