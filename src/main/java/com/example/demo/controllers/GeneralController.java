package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.example.demo.entities.userprofile;

@Controller
public class GeneralController {
	
	@GetMapping("/firstpage")
	public String showuser(@SessionAttribute("user") userprofile user, Model model) {
		model.addAttribute("user", user);
		return "firstpage";
	}
}
