package com.testmicro.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/get")
	public ResponseEntity<String>getdata(){
		return new ResponseEntity<String>("Hello Data", HttpStatus.OK);
	}
	
	@GetMapping("/getallstudent")
	public ResponseEntity<List<Student>>getAllStudent(){
		List<Student>ls=getstudent();
		ls.forEach(System.out::println);
		return new ResponseEntity<List<Student>>(ls, HttpStatus.OK);
	}
	
	public List<Student>getstudent(){
		
		List<Student>ls=new ArrayList<Student>();
		
		Student s1=new Student("Suman", 34);
		Student s2=new Student("raj", 20);
		Student s3=new Student("rajib", 50);
		
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		return ls;
		
		
	}
	
	
	

}
