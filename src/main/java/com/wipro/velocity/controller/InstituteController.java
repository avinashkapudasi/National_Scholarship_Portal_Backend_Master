package com.wipro.velocity.controller;
import java.util.List;
import com.wipro.velocity.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.velocity.model.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class InstituteController {

    @Autowired
    private InstituteRepository instrep;
    
    @PostMapping("/instituteregistration")
    public String reginst(@RequestBody InstituteModel ir)
    {
    	instrep.save(ir);
		return "institute is registered successfully";
    	
    }
    
    @GetMapping("/Institutes")
    public List<InstituteModel> getAllProducts(){
        return instrep.findAll();
    }
    
    @DeleteMapping("/deleteinstitute/{id}")
    public String deleteInstitution(@PathVariable int id)
    {
    	instrep.deleteById(id);
		return "institute is deleted successfully";
    }
}
