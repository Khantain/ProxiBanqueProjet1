package fr.formation.proxi1.metier;

/**
 * La classe Gerant represente le gerant d'une agence du reseau de la banque.
 * 
 * @author Adminl
 *
 */
public class Gerant {

	private String id;

	/**
	 * Constructeur de la classe Gerant
	 * 
	 * @param id Le nom du gerant.
	 */
	public Gerant(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ("Gerant " + this.id);
	}

}
