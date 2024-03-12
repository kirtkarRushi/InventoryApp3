package com.cjc.execption.serviceimpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.execption.Repository.ExceptionRespository;
import com.cjc.execption.model.Student;
import com.cjc.execption.service.Exceptionservice;

@Service
public class Serviceimpl implements Exceptionservice{
 Logger LOGGER =LoggerFactory.getLogger(Serviceimpl.class);
 @Autowired private ExceptionRespository erep; 
	@Override
	public Student saveStudent(Student st) {
		
		return erep.save(st);
	}

	@Override
	public Student getsinglestudent(int id) {
		Optional<Student> opstudent=erep.findById(id);
		if(opstudent.isPresent())
		{
			return opstudent.get();
		}
		else
		{
			LOGGER.error("Student not found..!");
		}
		return null;
	}

}
