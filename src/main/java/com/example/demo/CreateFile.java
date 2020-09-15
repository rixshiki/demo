package com.example.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

import org.springframework.web.multipart.MultipartFile;

public class CreateFile {
	
	public String invertfile(MultipartFile file) throws IOException {
		String encodefile = "";
		File convFile = new File(file.getOriginalFilename());
		convFile.createNewFile();
		FileOutputStream fos = new FileOutputStream(convFile);
		
		fos.write(file.getBytes());
		fos.close();
		byte[] fileContent = Files.readAllBytes(convFile.toPath());
		encodefile = Base64.getEncoder().encodeToString(fileContent);
		
		return encodefile;
	}
}
