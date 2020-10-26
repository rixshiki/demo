package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entities.userorder;
import com.example.demo.repositories.OrderDetailRepository;
import com.example.demo.repositories.PaymentRepository;
import com.example.demo.repositories.UserOrderRepository;

@Controller
public class OrderController {
	@Autowired
	private UserOrderRepository userorderRepo;
	
	@Autowired
	private OrderDetailRepository orderdetailRepo;
	
	@Autowired
	private PaymentRepository paymentRepo;
	
	@GetMapping("/checking")
	public String findchecking(Model model) {
		List<userorder> userorders = new ArrayList<userorder>();
		userorders = userorderRepo.getByStatus("checking");
		model.addAttribute("userorders", userorders);
		return "transfercheck";
	}
	
	@GetMapping("/tracking")
public String findtracking() {
		//List<userorder> userorders = new ArrayList<userorder>();
		//userorders = userorderRepo.getByStatus("tracking");
		return "transfertrack";
	}
	
	@GetMapping("/complete")
public String findcomplete() {
		//List<userorder> userorders = new ArrayList<userorder>();
		//userorders = userorderRepo.getByStatus("complete");
		return "transfercomplete";
	}
}
