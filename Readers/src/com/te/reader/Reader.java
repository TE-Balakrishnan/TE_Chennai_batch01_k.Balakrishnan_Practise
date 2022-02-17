package com.te.reader;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Reader {

	public static void main(String[] args) throws IOException {

	PDDocument pd = new PDDocument();
	File input = new File("C:\\Users\\hp\\Desktop\\edit\\"
			+ "TestYantra_Balakrishnan_K_JavaDeveloper_1.5yrs.pdf");
	pd.load(input);
	System.out.println(pd.getNumberOfPages());
   // System.out.println(pd.isEncrypted());
    PDFTextStripper reader = new PDFTextStripper();
    String pageText = reader.getText(pd);
    System.out.println(pageText);
	
	
		
		
	}

}
