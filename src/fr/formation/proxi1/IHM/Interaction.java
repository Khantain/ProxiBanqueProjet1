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
<<<<<<< HEAD
	}	
			
	public void mainMenu(Conseiller conseiller) {
		this.display("----------ProxiBanqueSI----------\n");		
		this.display("----------Menu principal----------\n");
		this.display("\t" + "1 - Creer un client");
		this.display("\t" + "2 - Gerer client");
		this.display("\t" + "3 - Quitter le programme");		
		String userInput = this.read();
		if (userInput.equals("1")) {
			Gestion gestion = new Gestion();
			gestion.creerClient(conseiller);		
		}
		else if (userInput.equals("2")) {
			this.Menugererclient(conseiller);
		}
		else if (userInput.equals("3")) {
			System.exit(0);
		}
		else {
			this.display("Saisie erronee, 1, 2 ou 3 attendu. \n");
			this.mainMenu(conseiller);
		}
=======
>>>>>>> 05c348a088c2478c7100e6815692d8ded85e4740
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

	public void Menugererclient() {
		this.display("");
<<<<<<< HEAD
		this.display("----------Menu de gestion de client----------\n");
		this.display("\t1 - Lister information client");
		this.display("\t2 - Modifier information client");		
		this.display("\t3 - Supprimer un client");
		this.display("\t4 - Faire virement");
		this.display("\t5 - Faire simulation");
		this.display("\t6 - Retour menu principal");
		this.display("\t7 - Quitter le programme");
=======
		this.display("----------Menu de gestion de client----------");
		this.display("\t" + "1 - Lister information client");
		this.display("\t" + "2 - Modifier information client");
		this.display("\t" + "3 - Supprimer un client");
		this.display("\t" + "4 - Faire virement");
		this.display("\t" + "5 - Faire simulation");
		this.display("\t" + "6 - Retour menu principal");
		this.display("\t" + "7 - Quitter le programme");
>>>>>>> 05c348a088c2478c7100e6815692d8ded85e4740
		String userInput = this.read();
		if (userInput.equals("1")) {
			Gestion gestion = new Gestion();
//			gestion.lireInfosClient(client)
		} else if (userInput.equals("2")) {
			Gestion gestion = new Gestion();
//			gestion.modifierClient(client);
		} else if (userInput.equals("3")) {
			Gestion gestion = new Gestion();
//				gestion.suppressionClient(client);
		} else if (userInput.equals("4")) {
			Gestion gestion = new Gestion();
//			gestion.faireVirement(clientCrediteur, clientDebiteur);
		} else if (userInput.equals("5")) {
			Gestion gestion = new Gestion();
//			gestion.faireSimulation(client);
		} else if (userInput.equals("6")) {
			this.mainMenu();
		} else if (userInput.equals("7")) {
			System.exit(0);
<<<<<<< HEAD
		}
		else {
			this.display("Saisie erronee, 1, 2, 3, 4, 5 ou 6 attendu.\n");
			this.Menugererclient(conseiller);
=======
		} else {
			this.display("Saisie erronee, 1, 2, 3, 4, 5 ou 6 attendu.");
			this.Menugererclient();
>>>>>>> 05c348a088c2478c7100e6815692d8ded85e4740
		}
	}
}
