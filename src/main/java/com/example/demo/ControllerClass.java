package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerClass {


@GetMapping("/welcome")
	public  String printwelcome() {
		System.out.print("Hello world");
		return "home.jsp";
	}

@GetMapping("/userdetails")
public String getuserdetails() {
	return "user.html";
}
}
