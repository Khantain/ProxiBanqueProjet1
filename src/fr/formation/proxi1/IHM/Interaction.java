package fr.formation.proxi1.IHM;

import java.util.Scanner;

import fr.formation.proxi1.Applicative.Gestion;
import fr.formation.proxi1.metier.Conseiller;

public class Interaction {

	public void display(String message) {
		System.out.println(message);
	}

	public String read() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
//		scanner.close();	
		return input;
	}

	public String mainMenu() {
		String reponse = "";
		do {
			this.display("----------ProxiBanqueSI----------" + "\n");
			this.display("----------Menu principal----------");
			this.display("\t" + "1 - Creer un client");
			this.display("\t" + "2 - Gerer client");
			this.display("\t" + "3 - Quitter le programme");
			reponse = this.read();
		} while (!reponse.equals("1") && !reponse.equals("2") &&!reponse.equals("3"));
		
		return reponse;
	}

	public String Menugererclient() {
		String reponse = "";
		do {
		this.display("");
		this.display("----------Menu de gestion de client----------");
		this.display("\t" + "1 - Lister information client");
		this.display("\t" + "2 - Modifier information client");
		this.display("\t" + "3 - Supprimer un client");
		this.display("\t" + "4 - Faire virement");
		this.display("\t" + "5 - Faire simulation");
		this.display("\t" + "6 - Retour menu principal");
		this.display("\t" + "7 - Quitter le programme");
		
		} while (!reponse.equals("1") && !reponse.equals("2") && !reponse.equals("3") && !reponse.equals("4") && !reponse.equals("5") && !reponse.equals("6") && !reponse.equals("7"));
		
		return reponse;
	}
}
