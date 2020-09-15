package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.demo.entities.userprofile;
import com.example.demo.repositories.UserProfileRepository;

@Controller
@SessionAttributes("user")
public class LoginController {
	
	@Autowired
	private UserProfileRepository userprofileRepo;
	
	@ModelAttribute("user")
	public userprofile setUpUserForm() {
		return new userprofile();
	}
	
	@GetMapping("/")
	public String login(Model model) {
		return "login";
	}
	
	@GetMapping("/logout")
	public String doLogout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "redirect:/";
	}
}
