package fr.formation.proxi1.IHM;

import java.util.Scanner;

/**
 * Classe permettant de communiquer avec l'utilisateur et d'afficher les
 * differents menus.
 * 
 * @author Adminl
 *
 */
public class Interaction {

	/**
	 * Affiche un message a l'utilisateur.
	 * 
	 * @param message Le message a afficher.
	 */
	public void display(String message) {
		System.out.println(message);
	}

	/**
	 * Enregistre la saisie de l'utilisateur.
	 * 
	 * @return La saisie faite par l'utilisateur.
	 */
	public String read() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();	
		return input;
	}

	/**
	 * Affiche le menu principal de l'application et retourne le chiffre
	 * correspondant a l'option choisie par l'utilisateur.
	 * 
	 * @return Le chiffre correspondant au choix de l'utilisateur.
	 */
	public String mainMenu() {
		String reponse = "";
		do {
			this.display("----------ProxiBanqueSI----------\n");
			this.display("----------Menu principal----------\n");
			this.display("\t" + "1 - Creer un client");
			this.display("\t" + "2 - Gerer client");
			this.display("\t" + "3 - Quitter le programme");
			reponse = this.read();
		} while (!reponse.equals("1") && !reponse.equals("2") && !reponse.equals("3"));
		return reponse;
	}

	/**
	 * Affiche le sous-menu de gestion de client et retourne le chiffre
	 * correspondant a l'option choisie par l'utilisateur.
	 * 
	 * @return Le chiffre correspondant au choix de l'utilisateur.
	 */
	public String menuGererClient() {
		String reponse = "";
		do {
			this.display("");
			this.display("----------Menu de gestion de client----------\n");
			this.display("\t1 - Afficher les informations d'un client");
			this.display("\t2 - Modifier les informations client");
			this.display("\t3 - Supprimer un client");
			this.display("\t4 - Faire virement");
			this.display("\t5 - Faire simulation");
			this.display("\t6 - Retour menu principal");
			this.display("\t7 - Quitter le programme");
			reponse = this.read();
		} while (!reponse.equals("1") && !reponse.equals("2") && !reponse.equals("3") && !reponse.equals("4")
				&& !reponse.equals("5") && !reponse.equals("6") && !reponse.equals("7"));
		return reponse;
	}
}
