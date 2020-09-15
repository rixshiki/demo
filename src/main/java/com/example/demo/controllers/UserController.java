package com.example.demo.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.CreateFile;
import com.example.demo.entities.userprofile;
import com.example.demo.repositories.UserProfileRepository;

@Controller
public class UserController {
	@Autowired
	private UserProfileRepository userprofileRepo;
	
	@GetMapping("/greeting")
	public String greeting(Model model) {
		model.addAttribute("user", new userprofile());
		return "signup";
	}
	
	@PostMapping("/savemem")
	public String saveMember(@ModelAttribute userprofile user
			, BindingResult errors
			, Model model
			,@RequestParam("imageFile") MultipartFile file) throws IOException  {
		if(!file.isEmpty()) {
			CreateFile bFile = new CreateFile();
			String image = bFile.invertfile(file);
			user.setPhotoUser(image);
		}
		user.setType("Customer");
		user.setCoin(0);
		userprofileRepo.save(user);
		model.addAttribute("message", "You have already signed.");
		model.addAttribute("user", new userprofile());
		return "signup";
	}
}
