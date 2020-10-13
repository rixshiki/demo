package com.example.demo.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.CreateFile;
import com.example.demo.entities.category;
import com.example.demo.repositories.CategoryRepository;

@Controller
public class ProductController {
	@Autowired
	private CategoryRepository categoryRepo;
	
	@GetMapping("/editproduct/{idcat}")
	public String editproduct(@PathVariable("idcat") String idcat
			,Model model) {
		List<category> catlist = new ArrayList<category>();
		catlist = categoryRepo.findAll();
		model.addAttribute("cat", categoryRepo.getOne(idcat));
		model.addAttribute("catlist", catlist);
		return "editproduct";
	}
	
	@GetMapping("/addoneproduct")
	public String addoneproduct() {
		
		return "addoneproduct";
	}
	
	@GetMapping("/addcategory")
	public String addcategory(Model model) {
		model.addAttribute("category", new category());
		return "addcategory";
	}
	
	@PostMapping("/savecat")
	public String saveCategory(@ModelAttribute category category
			, BindingResult errors
			, Model model
			,@RequestParam("imageFile") MultipartFile file) throws IOException {
		if(!file.isEmpty()) {
			CreateFile bFile = new CreateFile();
			String image = bFile.invertfile(file);
			category.setPhotoCat(image);
		}
		categoryRepo.save(category);
		return "redirect:/editproduct/1";
	}
	
	@PostMapping("/updatecat")
	public String updateMember(@ModelAttribute category category
			,@RequestParam("imageFile") MultipartFile file) throws IOException{
		System.out.println(category.getNameCat());
		category cat = new category();
		cat = categoryRepo.findById(category.getIdCategory()).get();
		cat.setDetailCat(category.getDetailCat());
		if(!file.isEmpty()) {
			CreateFile bFile = new CreateFile();
			String image = bFile.invertfile(file);
			cat.setPhotoCat(image);
		}
		categoryRepo.save(cat);
		System.out.println("Category Update!!");
		return "redirect:/editproduct/1";
	}
	
}
