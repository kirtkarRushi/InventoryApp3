package com.cjc.exception_rest;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.cjc.enums.Enum;
import com.cjc.exception.dto.BaseResponse;
import com.cjc.exception_rest.exception.NotValidDetails;
import com.cjc.exception_rest.exception.StudentNotFound;


@RestControllerAdvice
public class ApplicationexceptionHandler {
	
@ExceptionHandler(StudentNotFound.class)
public ResponseEntity<BaseResponse> handleStudentNotFound(){
		
		System.out.println("Handle exception");
		return new ResponseEntity<BaseResponse>( new BaseResponse(Enum.Student_Is_Not_Available.toString(),new Date()),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(NotValidDetails.class)
public ResponseEntity<BaseResponse> HandleDuplicateEntry()
{
	return new ResponseEntity<BaseResponse>(new BaseResponse(Enum.Mobile_Number_Already_Exists.toString(),new Date()),HttpStatus.NOT_ACCEPTABLE);
}
}
