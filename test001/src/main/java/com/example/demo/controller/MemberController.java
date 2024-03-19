package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	
	@GetMapping("/")
	public String index() {
		System.out.println("index");
		return "index";
	}
}
