package fr.formation.proxi1.IHM;

import java.util.Scanner;

import fr.formation.proxi1.Applicative.Gestion;

public class Interaction {
		
	public void display(String message) {
		System.out.println(message);
	}
	
	public String read() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();	
//		scanner.close();	
		return input;
	}	
	
	public void mainMenu() {
		Conseiller conseiller = new Conseiller();
		this.display("");
		this.display("----------Menu principal----------");
		this.display("\t" + "1 - Cr�er un client");
		this.display("\t" + "2 - G�rer client");
		this.display("\t" + "3 - Quitter le programme");		
		String userInput = this.read();
		if (userInput.equals("1")) {
			Gestion gestion = new Gestion();
			gestion.creerClient();		
		}
		else if (userInput.equals("2")) {
			this.Menugererclient();
		}
		else if (userInput.equals("3")) {
			System.exit(0);
		}
		else {
			this.display("Saisie erron�e, 1, 2 ou 3 attendu.");
			this.mainMenu();
		}
	}
	
	public void Menugererclient() {
		this.display("");
		this.display("----------Menu de gestion de client----------");
		this.display("\t" + "1 - Lister information client");
		this.display("\t" + "2 - Supprimer un client");
		this.display("\t" + "3 - Faire virement");
		this.display("\t" + "4 - Faire simulation");
		this.display("\t" + "5 - Retour menu principal");
		this.display("\t" + "6 - Quitter le programme");
		String userInput = this.read();
		if (userInput.equals("1")) {
			Gestion gestion = new Gestion();
//			gestion.lireInfosClient(client)
		}
		else if (userInput.equals("2")) {
			Gestion gestion = new Gestion();
//			gestion.suppressionClient(client);
		}
		else if (userInput.equals("3")) {
			Gestion gestion = new Gestion();
//			gestion.faireVirement(clientCrediteur, clientDebiteur);
		}
		else if (userInput.equals("4")) {
			Gestion gestion = new Gestion();
//			gestion.faireSimulation(client);
		}
		else if (userInput.equals("5")) {
			this.mainMenu();
		}
		else if (userInput.equals("6")) {
			System.exit(0);
		}
		else {
			this.display("Saisie erron�e, 1, 2, 3, 4, 5 ou 6 attendu.");
			this.Menugererclient();
		}
	}	
}
