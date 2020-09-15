package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/dologin")
	public String doLogin(@ModelAttribute("user") userprofile mem
			, Model model) {
		List<userprofile> userList = new ArrayList<userprofile>();
		boolean correct = false;
		userList = userprofileRepo.findByemail(mem.getEmail());
		String web = "login";
		for(userprofile user : userList) {
			if(user.getEmail().equalsIgnoreCase(mem.getEmail()) && user.getPassword().equalsIgnoreCase(mem.getPassword())) {
					mem.setIdUser(user.getIdUser());
					mem.setAddress(user.getAddress());
					mem.setBirthday(user.getBirthday());
					mem.setCoin(user.getCoin());
					mem.setGender(user.getGender());
					mem.setLine(user.getLine());
					mem.setName(user.getName());
					mem.setPhotoUser(user.getPhotoUser());
					mem.setTel(user.getTel());
					mem.setType(user.getType());
					web = "redirect:/firstpage";
					correct = true;
			}
		}
		model.addAttribute("correct", correct);
		return web;
	}
	
	@GetMapping("/logout")
	public String doLogout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "redirect:/";
	}
}
