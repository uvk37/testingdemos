package com.simplilearn.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
	@GetMapping("/")
	public String hello() {
		return "Hello ! Welcome to Amazon Aws Application ";
	}

}