package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	public String findchecking() {
		
		return "transfercheck";
	}
	
	@GetMapping("/tracking")
public String findtracking() {
		
		return "transfertrack";
	}
	
	@GetMapping("/complete")
public String findcomplete() {
		
		return "transfercomplete";
	}
}
