package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.delivery;

@Controller
public class DeliveryController {

	@GetMapping("/editdelivery")
	public String editdelivery(Model model) {
		model.addAttribute("dalivery", new delivery());
		return "editdelivery";
	}
}
