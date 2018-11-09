package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

/**
 * 
 * @author Adminl
 *
 *Cette classe caracterise les attributs et methode de la Carte Visa Electron.
 *
 */

public class CarteVisa extends CarteBancaire {

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur d'initialisation de la classe "CarteVisa".
	 *
	 */
	
	public CarteVisa(String id, String status) {
		super(id, status);
	}

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur par default de la classe "CarteVisa".
	 *
	 */
	
	public CarteVisa() {
		super();
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
		return (super.toString() + " Carte de type electron");
	}
}
