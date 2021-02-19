package com.example.SeconfSimpleCrud.service;

import org.springframework.http.ResponseEntity;

import com.example.SeconfSimpleCrud.dto.StudentDto;

public interface StudentService {
	
	public ResponseEntity<?> createStudent(StudentDto dto);
	public ResponseEntity<?> getallStudent();
	public ResponseEntity<?> deletestudent(String token);
	public ResponseEntity<?> updatestudent(String token,StudentDto dto);

}
