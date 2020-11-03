package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.delivery;
import com.example.demo.repositories.DeliveryRepository;

@Controller
public class DeliveryController {
	
	@Autowired
	private DeliveryRepository deliveryRepo;
	
	@GetMapping("/editdelivery")
	public String editdelivery(Model model) {
		List<delivery> deliveryList = new ArrayList<delivery>();
		deliveryList = deliveryRepo.findAll();
		model.addAttribute("delivery", new delivery());
		model.addAttribute("deliveryList", deliveryList);
		return "adddeliveryprice";
	}
	
	@PostMapping("/savedelivery")
	public String savedelivery(@ModelAttribute delivery delivery
			,@RequestParam("textname") String textname
			,@RequestParam("selectname") String selectname
			,@RequestParam("hidden") String hidden) {
		if(hidden.equalsIgnoreCase("text")) {
			delivery.setNameDelivery(textname);
		}else if(hidden.equalsIgnoreCase("select")) {
			delivery.setNameDelivery(selectname);
		}
		deliveryRepo.save(delivery);
		return "redirect:/editaccount";
	}
	
}
