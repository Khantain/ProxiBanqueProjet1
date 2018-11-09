package fr.formation.proxi1.metier;

/**
 * 
 * @author Adminl
 *
 *Cette classe caracterise les attributs et methode du Gerant.
 *
 */

public class Gerant {
	
	public String id;

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur d'initialisation de la classe "Gerant".
	 *
	 */
	
	public Gerant(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @author Adminl
	 *
	 *Permet de redefinir la methode toString de la classe "Object".
	 *
	 */
	
	@Override
	public String toString() {
		return ("Gerant "+ this.id);
	}


}
