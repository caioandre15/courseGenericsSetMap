package course.java.map.exer03.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import course.java.map.exer03.entities.CountingOfVotes;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file path: ");
		String path = sc.nextLine();
		
		Map<CountingOfVotes, Integer> counting = new TreeMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				
				int sum = 0;
				String[] fields = line.split(",");
				
				CountingOfVotes countingOfVotes = new CountingOfVotes(fields[0], Integer.parseInt(fields[1]));
				boolean validate = counting.containsKey(countingOfVotes);
				
				sum = countingOfVotes.getVoteCount();
				if (validate) {
					sum = countingOfVotes.getVoteCount() + counting.get(countingOfVotes);
				}
				
				counting.put(countingOfVotes, sum);
				line = br.readLine();
			}
			
			for (CountingOfVotes c : counting.keySet()) {
				System.out.println(c.getName() + ": " + counting.get(c));
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
