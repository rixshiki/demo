package com.example.demo.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	//@Autowired
	//private UserProfileRepository userprofileRepo;
	
	@GetMapping("/")
	public String login(Model model) {
		return "login";
	}
	
	/*
	@GetMapping("/login")
	 public String login(Model model) {
		userprofile user = new userprofile();
		user.setEmail("nice@mail.com");
		user.setPassword("nice1234");
		user.setName("Nice");
		user.setBirthday(LocalDate.now());
		user.setGender("female");
		user.setAddress("xxxxxxxxxx");
		user.setLine("@tijnuehc");
		user.setTel("088888888");
		user.setType("Seller");
		user.setCoin(0);
		userprofileRepo.save(user);
	  return "login";
	 }
	@GetMapping("/")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}*/

}
