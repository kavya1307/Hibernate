package com.example.SeconfSimpleCrud.serviceimpl;

import java.util.List;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.SeconfSimpleCrud.dto.StudentDto;
import com.example.SeconfSimpleCrud.entity.Student;
import com.example.SeconfSimpleCrud.repository.StudentRepository;
import com.example.SeconfSimpleCrud.service.StudentService;

@Service

public class StudentServiceImpl implements StudentService{

	@Autowired 
	private StudentRepository repository;
	
	@Override
	public ResponseEntity<?> createStudent(StudentDto dto) {
	
//		
//		long id = dto.getId();
//		String firstname = dto.getFirstname();
//		String middlename = dto.getMiddlename();
//		String lastname = dto.getLastname();
//		String school = dto.getSchool();
//		String std = dto.getStd();
//		String parentcontact = dto.getParentcontact();
//		
//		
//		Map<String, Object> map = new HashMap<String, Object>();
//		if(firstname.isEmpty()) {
//			 map.put("code", 404);
//			 map.put("message","firstname is not valid..");
//			 map.put("status", false);
//			 map.put("firstname", firstname);
//			 return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
//		}
//		if(lastname.isEmpty())
//		{
//			map.put("code", 404);
//			map.put("message", "lastname is not valid...");
//			map.put("status", false);
//			map.put("lastname", lastname);
//			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
//		}
//		if(middlename.isEmpty() ) {
//			
//			map.put("code", 404);
//			map.put("message", "middlename is not valid...");
//			map.put("status", false);
//			map.put("middlename", middlename);
//			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
//		}
//		if(school.isEmpty())
//		{
//			map.put("code", 404);
//			map.put("message", "school name is not valid");
//			map.put("status", false);
//			map.put("school", school);
//			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
//		}
//		if(std.isEmpty())
//		{
//			map.put("code", 404);
//			map.put("message", "stdanderd is not valid");
//			map.put("status", false);
//			map.put("std", std);
//			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
//		}
//		if(parentcontact.isEmpty()) {
//			map.put("code", 404);
//			map.put("message", "parentcontact number is not valid");
//			map.put("status", false);
//			map.put("parentcontact", parentcontact);
//			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
//		}
//		else {
		Map<String, Object> map = new HashMap<String, Object>();

			Map<String, Object> hashMap = new HashMap<String, Object>();
			dto.setToken(generateRandom());
			hashMap.put("firstname", dto.getFirstname());
			hashMap.put("middlename", dto.getMiddlename());
			hashMap.put("lastname", dto.getLastname());
			
			String studentname = dto.getFirstname() +" "+ dto.getMiddlename() + " " +	dto.getLastname();		
			ModelMapper modelMapper = new ModelMapper();
			
			Student student = modelMapper.map(dto, Student.class);
			student.setStudentname(studentname);
			
			
			LinkedHashMap<String, Object> map1 = new LinkedHashMap<String, Object>();
			map1.put("studentname", hashMap);
			map1.put("std", student.getStd());
			map1.put("school", student.getSchool());
			map1.put("parentcontact", student.getParentcontact());
			map1.put("token", dto.getToken());
			map.put("code", 200);
			map.put("message", "added student detail...");
			map.put("status", true);
			map.put("data", map1);
			repository.save(student);
		return ResponseEntity.ok(map);
		
		}
		
	

	private String generateRandom() {
		String aToZ = "01234ABCDEFGHIJKLMNO012345PQRSTUVWXYZ678901235abcdefghijklmnopqrstuvwxyz6789";

		Random rand = new Random();
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			int randIndex = rand.nextInt(aToZ.length());
			res.append(aToZ.charAt(randIndex));
		}
		return res.toString();	}

	@Override
	public ResponseEntity<?> getallStudent() {
		List<Student> list = repository.findAll();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 200);
		map.put("message", "get all bank...");
		map.put("status", true);
		map.put("data", list);
		
		return ResponseEntity.ok(map);	
		
	}
//	@Override
//	public ResponseEntity<?> deleteEmployee(int employeeid) {
//		emplRepo.deleteById(employeeid);
//		return ResponseEntity.ok(res.deleteSingleBook(employeeid));
//	}

	@Override
	public ResponseEntity<?> deletestudent(String token) {
		Student student = repository.findByToken(token);
		Map<String, Object> map = new HashMap<String, Object>();
		if (!repository.existsBytoken(token)) {
			map.put("code", 404);
			map.put("message", "Token not found");
			map.put("status", false);
			map.put("userid", token);
			return ResponseEntity.ok(map);
		} else {

			map.put("code", 200);
			map.put("message", "Delete Successfully");
			map.put("status", true);
			map.put("deleted-data", token);
			repository.delete(student);
			map.put("above data", "deleted");
			return ResponseEntity.ok(map);
		}
		
	}

	@Override
	public ResponseEntity<?> updatestudent(String token, StudentDto dto) {
		long id = dto.getId();
		String firstname = dto.getFirstname();
		String middlename = dto.getMiddlename();
		String lastname = dto.getLastname();
		String school = dto.getSchool();
		String std = dto.getStd();
		String parentcontact = dto.getParentcontact();
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		if(firstname.isEmpty()) {
			 map.put("code", 404);
			 map.put("message","firstname is not valid..");
			 map.put("status", false);
			 map.put("firstname", firstname);
			 return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
		}
		if(lastname.isEmpty())
		{
			map.put("code", 404);
			map.put("message", "lastname is not valid...");
			map.put("status", false);
			map.put("lastname", lastname);
			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
		}
		if(middlename.isEmpty() ) {
			
			map.put("code", 404);
			map.put("message", "middlename is not valid...");
			map.put("status", false);
			map.put("middlename", middlename);
			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
		}
		if(school.isEmpty())
		{
			map.put("code", 404);
			map.put("message", "school name is not valid");
			map.put("status", false);
			map.put("school", school);
			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
		}
		if(std.isEmpty())
		{
			map.put("code", 404);
			map.put("message", "stdanderd is not valid");
			map.put("status", false);
			map.put("std", std);
			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
		}
		if(parentcontact.isEmpty()) {
			map.put("code", 404);
			map.put("message", "parentcontact number is not valid");
			map.put("status", false);
			map.put("parentcontact", parentcontact);
			return ResponseEntity.status(HttpStatus.NON_AUTHORITATIVE_INFORMATION).body(map);
		}
		Map<String, Object> hashMap = new HashMap<String, Object>();
//		dto.setToken(generateRandom());
//		hashMap.put("firstname", dto.getFirstname());
//		hashMap.put("middlename", dto.getMiddlename());
//		hashMap.put("lastname", dto.getLastname());
//		
//		String studentname = dto.getFirstname() +" "+ dto.getMiddlename() + " " +	dto.getLastname();		
		ModelMapper modelMapper = new ModelMapper();
		
		Student student = modelMapper.map(dto, Student.class);
		//student.setStudentname(studentname);
		map.put("code", 200);
		map.put("message", "added student detail...");
		map.put("status", true);
		map.put("data", repository.save(student));
		
	return ResponseEntity.ok(map);
		
	}
	
	

	
	
}
