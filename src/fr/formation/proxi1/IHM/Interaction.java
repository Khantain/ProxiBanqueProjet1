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
	
	public void mainMenu() {
		Conseiller conseiller = new Conseiller();
		this.display("----------ProxiBanqueSI----------" + "\n");		
		this.display("");
		this.display("----------Menu principal----------");
		this.display("\t" + "1 - Créer un client");
		this.display("\t" + "2 - Gérer client");
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
			this.display("Saisie erronée, 1, 2 ou 3 attendu.");
			this.mainMenu();
		}
	}
	
	public void Menugererclient() {
		this.display("");
		this.display("----------Menu de gestion de client----------");
		this.display("\t" + "1 - Lister information client");
		this.display("\t" + "2 - Modifier information client");		
		this.display("\t" + "3 - Supprimer un client");
		this.display("\t" + "4 - Faire virement");
		this.display("\t" + "5 - Faire simulation");
		this.display("\t" + "6 - Retour menu principal");
		this.display("\t" + "7 - Quitter le programme");
		String userInput = this.read();
		if (userInput.equals("1")) {
			Gestion gestion = new Gestion();
//			gestion.lireInfosClient(client)
		}
		else if (userInput.equals("2")) {
			Gestion gestion = new Gestion();
//			gestion.modifierClient(client);
		}
		else if (userInput.equals("3")) {
				Gestion gestion = new Gestion();
//				gestion.suppressionClient(client);
		}
		else if (userInput.equals("4")) {
			Gestion gestion = new Gestion();
//			gestion.faireVirement(clientCrediteur, clientDebiteur);
		}
		else if (userInput.equals("5")) {
			Gestion gestion = new Gestion();
//			gestion.faireSimulation(client);
		}
		else if (userInput.equals("6")) {
			this.mainMenu();
		}
		else if (userInput.equals("7")) {
			System.exit(0);
		}
		else {
			this.display("Saisie erronée, 1, 2, 3, 4, 5 ou 6 attendu.");
			this.Menugererclient();
		}
	}	
}
