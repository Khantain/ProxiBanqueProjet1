package fr.formation.proxi1.IHM;

import java.util.Scanner;

public class Interaction {
	
	Scanner sc;
	
	public void display(String message) {
		System.out.println(message);
	}
	
	public String read() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();	
		scanner.close();	
		return input;
	}	
	
	public void choixMenu() {
		
	}

}
