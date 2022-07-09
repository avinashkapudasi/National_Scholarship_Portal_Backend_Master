package com.wipro.velocity.controller;
import java.util.List;
import com.wipro.velocity.repository.*;
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

import com.wipro.velocity.model.StudentModel;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class StudentController {

	@Autowired
	private StudentRepository sturep;

	@PostMapping("/registerstudent")
	public String regstu(@RequestBody StudentModel sr)
	{
		sturep.save(sr);
		return "student is registered successfully";

	}

	@GetMapping("/Students")
	public List<StudentModel> getAllProducts(){
		return sturep.findAll();
	}
	@GetMapping("/candidate/{email}")
    public ResponseEntity<StudentModel> getStudentById(@PathVariable(value="email") String email)
    		throws ResourceNotFoundException
        {
                   StudentModel studentModel =sturep.findByEmail(email).
                   orElseThrow(() -> new ResourceNotFoundException
                    ("student Not Found for this Id: "+email));
                   
                   return ResponseEntity.ok().body(studentModel);     
        }
	
	@PostMapping("/loginstudent")
	public Boolean loginStudent(@Validated @RequestBody StudentModel studentModel) throws ResourceNotFoundException {

		Boolean isLogin=false;
		String email=studentModel.getEmail();
		String password=studentModel.getPassword();

		 StudentModel stu = sturep.findByEmail(email).orElseThrow(() ->
		new ResourceNotFoundException("Unknown Student"));
		 
		if(email.equals(stu.getEmail()) && password.equals(stu.getPassword()))
		{
			isLogin=true;
		}
		return isLogin;
	}

	@DeleteMapping("/deletestudent/{id}")
	public String deletestudent(@PathVariable int id)
	{
		sturep.deleteById(id);
		return "student is deleted successfully";
	}
}
