package com.te.questions.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\hp\\Desktop\\file.txt");
		try {
			Scanner sc = new Scanner(file);
			System.out.println(file.getAbsolutePath());
				while(sc.hasNext()) {
					String str = sc.nextLine();
					System.out.println(str);
					System.out.println();
				}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
