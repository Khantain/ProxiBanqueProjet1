package fr.formation.proxi1.IHM;

import java.util.Scanner;

/**
 * 
 * @author Adminl
 *
 *Cette classe caracterise les methodes de l'Agence.
 *
 */

public class Interaction {

	/**
	 * 
	 * @author Adminl
	 *
	 *Cette methode permet de créer un raccourci pour faire appele à "System.out.println".
	 *Elle permet d'afficher le contenant de message.
	 *
	 */
	
	public void display(String message) {
		System.out.println(message);
	}

	/**
	 * 
	 * @author Adminl
	 *
	 *Cette methode permet de créer un raccourci permettant de créer un nouveaux scanner.
	 *La valeur du nouveau scanner est egale au contenu de la ligne saisi juste apres grace a nextLine.
	 *
	 */
	
	public String read() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
//		scanner.close();	
		return input;
	}	
	
	/**
	 * 
	 * @author Adminl
	 *
	 *Cette methode permet d'afficher le menu d'entree de l'application.
	 *Le menu permet de choisir entre 3 options differentes :
	 *	1 - Creer un client
	 *	2 - Gerer client
	 *	3 - Quitter le programme
	 *et retourne la reponse rentre dans le terminal par l'utilisateur.
	 *
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
	 * 
	 * @author Adminl
	 *
	 *Cette methode permet d'afficher le menu d'entree de l'application.
	 *Le menu permet de choisir entre 7 options differentes :
	 *	1 - Afficher les informations d'un client
	 *	2 - Modifier les informations client
	 *	3 - Supprimer un client
	 *	4 - Faire virement
	 *	5 - Faire simulation
	 *	6 - Retour menu principal
	 *	7 - Quitter le programme
	 *et retourne la reponse rentre dans le terminal par l'utilisateur.
	 *
	 */

	public String Menugererclient() {
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
		} while (!reponse.equals("1") && !reponse.equals("2") && !reponse.equals("3") && !reponse.equals("4") && !reponse.equals("5") && !reponse.equals("6") && !reponse.equals("7"));
		return reponse;
	}
}
