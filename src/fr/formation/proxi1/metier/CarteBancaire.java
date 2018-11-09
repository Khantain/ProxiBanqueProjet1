package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

/**
 * 
 * @author Adminl
 *
 *Cette classe caracterise les attributs et methode de la Carte Bancaire.
 *
 */

public class CarteBancaire {

	public String id;
	public String status;

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur d'initialisation de la classe "CarteBancaire".
	 *
	 */
	
	public CarteBancaire(String id, String status) {
		this.id = id;
		this.status = status;
	}

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur par default de la classe "CarteBancaire".
	 *
	 */
	
	public CarteBancaire() {
		Interaction interaction = new Interaction();
		interaction.display("Saisir numero carte Visa Electron");
		this.id = interaction.read();
		this.status = "active";
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
		return ("Carte numero : " + this.id + ". Statut : " + this.status + ".");
	}

}
