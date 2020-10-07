package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("/editproduct")
	public String editproduct() {
		
		return "editproduct";
	}
	
	@GetMapping("/addcategory")
	public String addcategory() {
		
		return "addcategory";
	}
	
	@GetMapping("/addoneproduct")
	public String addoneproduct() {
		
		return "addoneproduct";
	}
}
