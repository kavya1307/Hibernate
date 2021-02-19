package com.example.SeconfSimpleCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SeconfSimpleCrud.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	Student findByToken(String token);

	boolean existsBytoken(String token);

	void deleteByToken(String token);
	
	

}
