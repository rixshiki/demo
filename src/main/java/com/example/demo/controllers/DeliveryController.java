package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		List<String> namedeliList = new ArrayList<String>();
		namedeliList = deliveryRepo.getAllNamedelivery();
		List<delivery> deliveryList = new ArrayList<delivery>();
		deliveryList = deliveryRepo.findAllOrderByNameDeli();
		model.addAttribute("delivery", new delivery());
		model.addAttribute("namedeliList", namedeliList);
		model.addAttribute("deliveryList", deliveryList);
		return "adddeliveryprice";
	}
	
	@PostMapping("/savedelivery")
	public String savedelivery(@ModelAttribute delivery delivery
			,@RequestParam(name = "textname", defaultValue = "") String textname
			,@RequestParam(name = "selectname", defaultValue = "") String selectname
			,@RequestParam(name = "hidetext", defaultValue = "select") String hidetext) {
		if(hidetext.equalsIgnoreCase("text")) {
			delivery.setNameDelivery(textname);
		}else if(hidetext.equalsIgnoreCase("select")) {
			delivery.setNameDelivery(selectname);
		}
		deliveryRepo.save(delivery);
		return "redirect:/editdelivery";
	}
	
	@GetMapping("/deletedelivery/{iddelivery}")
	public String deleteaccount(@PathVariable("iddelivery") int iddelivery) {
		deliveryRepo.deleteByIdDelivery(iddelivery);
		return "redirect:/editdelivery";
	}
	
}
