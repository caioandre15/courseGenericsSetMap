package course.java.generics.exer002.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import course.java.generics.exer002.service.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		String path = "c:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			
			while (line != null) {
				list.add(Integer.parseInt(line));
			    line = br.readLine();
			}
		
			System.out.println("Most value: ");
			System.out.println(CalculationService.max(list));
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
