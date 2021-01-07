package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.orderdetail;
import com.example.demo.entities.userorder;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;

@Service
public class CreatePDF {

	public void printOrder(Document document,List<userorder> userorders,List<orderdetail> orderlists)throws DocumentException {
		FontFactory.register("D:\\front\\THSarabunNew.ttf", "sarabun");
		Font boldFont = FontFactory.getFont("sarabun", "TIS-620",true, Font.BOLD);
		Font textFont = FontFactory.getFont("sarabun", "TIS-620",true, Font.NORMAL);
		int i = 0;
		
		while(userorders.size()<=i) {
			if(userorders.size()-i>1) {
				
				i+=2;
			}else{									//หน้าที่มีorderเดียว
				
			}
		}
		
	}
	
	private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
	}
}
