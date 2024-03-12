package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.execption.model.Student;
import com.cjc.execption.service.Exceptionservice;

@RestController
public class Facultycontroller {
@Autowired Exceptionservice hs;
@GetMapping("/get_student/{id}")
public ResponseEntity<Student> getdata(@PathVariable int id)
{
	Student student=hs.getsinglestudent(id);
	return new ResponseEntity<Student>(student,HttpStatus.OK);
}
}
