package pl.polsl.egradebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index(){
		return "login.html";
	}
	
	@GetMapping("/login")
	public String login(){
		return "login.html";
	}
	
	
	
}