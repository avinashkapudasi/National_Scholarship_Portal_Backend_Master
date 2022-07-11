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
import com.wipro.velocity.model.NodalModel;
import com.wipro.velocity.model.StudentModel;
import com.wipro.velocity.repository.InstituteRepository;
import com.wipro.velocity.repository.NodalRepository;
import com.wipro.velocity.repository.StudentApplicationRepository;
import com.wipro.velocity.repository.StudentRepository;

@RestController
@CrossOrigin(origins = "*")
public class NodalController {
	@Autowired
	private StudentRepository stuRep;
	
	@Autowired
	private StudentApplicationRepository stuAppRepo;
	
	@Autowired
	private NodalRepository nodalRepo;
	
	@Autowired
	private InstituteRepository instRepo;
	
	//nodal login
	@PostMapping("/nodallogin")
	public Boolean loginNodal(@Validated @RequestBody NodalModel nodalModel) throws ResourceNotFoundException {

		Boolean isLogin=false;
		String id=nodalModel.getNodalId();
		String password=nodalModel.getPassword();

		 NodalModel nodal = nodalRepo.findByNodalId(id).orElseThrow(() ->
		new ResourceNotFoundException("Unknown Nodal credentials"));
		 
		if(id.equals(nodal.getNodalId()) && password.equals(nodal.getPassword()))
		{
			isLogin=true;
		}
		return isLogin;
	}
	
	@GetMapping("/Students")
	public List<StudentModel> getAllStudents(){
		return stuRep.findAll();
	}
	@GetMapping("/candidate/{email}")
    public ResponseEntity<StudentModel> getStudentById(@PathVariable(value="email") String email)
    		throws ResourceNotFoundException
        {
                   StudentModel studentModel =stuRep.findByEmail(email).
                   orElseThrow(() -> new ResourceNotFoundException
                    ("student Not Found for this Id: "+email));
                   
                   return ResponseEntity.ok().body(studentModel);     
        }
	
    
    @GetMapping("/institutes")
    public List<InstituteModel> getAllInstitutions(){
        return instRepo.findAll();
    }
    
    @DeleteMapping("/delete-institute/{id}")
    public String deleteInstitution(@PathVariable String id)
    {
    	instRepo.deleteById(id);
		return "institute is deleted successfully";
    }

}
