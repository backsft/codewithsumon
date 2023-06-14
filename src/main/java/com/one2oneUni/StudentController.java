package com.one2oneUni;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
   
	@Autowired
	StudentRepo studentRepo;

    // End point to create a student with info
    @PostMapping("/insert")
    public Student createStudent(@RequestBody Student student) {
    	
    	Optional<Student> findById = studentRepo.findById(student.getSt_id());
    	
    	if(findById.isPresent())
    	{
    		System.out.println("id alredy exist ");
    		return null;
    	}
    	else
        return studentRepo.save(student);
    }

 // all informations
    @GetMapping("/getalldata")
    public List<Student> getallStudent() {
        return studentRepo.findAll();
    }
    
    // End point to get a student by ID
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable("id") long id) {
        return studentRepo.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Student not found"));
    }
    
    
    
    
    
}
