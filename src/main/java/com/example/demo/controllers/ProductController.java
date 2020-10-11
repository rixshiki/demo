package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.category;

@Controller
public class ProductController {

	@GetMapping("/editproduct")
	public String editproduct() {
		
		return "editproduct";
	}
	
	@GetMapping("/addcategory")
	public String addcategory(Model model) {
		model.addAttribute("category", new category());
		return "addcategory";
	}
	
	@GetMapping("/addoneproduct")
	public String addoneproduct() {
		
		return "addoneproduct";
	}
}
