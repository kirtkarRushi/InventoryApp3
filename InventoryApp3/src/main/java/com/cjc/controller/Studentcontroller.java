package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.execption.model.Student;
import com.cjc.execption.service.Exceptionservice;

@RestController
@CrossOrigin("*")
public class Studentcontroller {
@Autowired private Exceptionservice exser;
@PostMapping("/register_Student")
public ResponseEntity<Student> createStudent(@RequestBody Student st)
{
	st=exser.saveStudent(st);
	return new ResponseEntity<Student>(st,HttpStatus.CREATED);
}
@GetMapping("/Student/{id}")
public ResponseEntity<Student> expose(@PathVariable int id)
{
	Student st=exser.getsinglestudent(id);
	return new ResponseEntity<Student>(st,HttpStatus.OK);
}

}
