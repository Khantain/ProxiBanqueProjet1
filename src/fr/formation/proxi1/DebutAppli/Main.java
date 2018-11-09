package fr.formation.proxi1.DebutAppli;

import fr.formation.proxi1.Applicative.Gestion;

/***
 * 
 * @author Adminl
 *
 *Cette classe est le point d'entree de l'application.
 *
 */

public class Main {

	/***
	 * 
	 * @author Adminl
	 *
	 *Cette methode est le commencement de l'application.
	 *
	 */
	
	public static void main(String[] args) {
		Gestion gestion = new Gestion();
		gestion.start();
	}
}
