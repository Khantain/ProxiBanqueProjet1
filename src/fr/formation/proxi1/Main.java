package fr.formation.proxi1;

import fr.formation.proxi1.Applicative.Gestion;

/**
 * Classe contenant le point d'entree de l'application.
 * 
 * @author Adminl
 *
 */
public class Main {

	/**
	 * Point d'entree de l'application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Gestion gestion = new Gestion();
		gestion.start();
	}
}
