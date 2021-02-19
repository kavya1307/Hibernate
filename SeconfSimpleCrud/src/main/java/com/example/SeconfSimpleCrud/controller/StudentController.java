package com.example.SeconfSimpleCrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SeconfSimpleCrud.dto.StudentDto;
import com.example.SeconfSimpleCrud.service.StudentService;

@RestController
@RequestMapping("/stud")
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/adding")
	public ResponseEntity<?> createstudentdetail(@RequestBody StudentDto dto){
		return service.createStudent(dto);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<?> getAllstudent()
	{
		return service.getallStudent();
	}
	
	@DeleteMapping("/delete/{token}")
	public ResponseEntity<?> deletestudent(@RequestParam String token){
		return service.deletestudent(token);

	}
	
	@PutMapping("/update/{token}")
	public ResponseEntity<?> updatestudent(@PathVariable String token, @RequestBody  StudentDto dto)
	{
		return service.updatestudent(token, dto);
	}
	
}
