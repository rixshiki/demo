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

import com.example.demo.entities.account;
import com.example.demo.repositories.AccountRepository;

@Controller
public class AccountController {

	@Autowired
	private AccountRepository accountRepo;
	
	@GetMapping("/editaccount")
	public String editaccount(Model model) {
		List<account> accountList = new ArrayList<account>();
		accountList = accountRepo.findAllOrderByNameBank();
		model.addAttribute("account", new account());
		model.addAttribute("accountList", accountList);
		return "editaccount";
	}
	
	@PostMapping("/saveaccount")
	public String saveaccount(@ModelAttribute account account) {
		accountRepo.save(account);
		return "redirect:/editaccount";
	}
	
	@GetMapping("/deleteaccount/{numaccount}")
	public String deleteaccount(@PathVariable("numaccount") String numaccount) {
		accountRepo.deleteByNumAccount(numaccount);
		return "redirect:/editaccount";
	}
}
