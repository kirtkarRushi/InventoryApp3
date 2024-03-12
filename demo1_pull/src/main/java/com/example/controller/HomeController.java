package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Model;
import com.example.service.Homeservice;


@RestController
public class HomeController {
@Autowired Homeservice hs;
	@PostMapping("/send_data")
	public void postdata(@RequestBody Model m)
	{
		Model stu=hs.getdata();
	}
	@GetMapping("/getdata")
	public void getdata()
	{
		hs.getdata();
	}
}
