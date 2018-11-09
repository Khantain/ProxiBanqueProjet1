package fr.formation.proxi1.metier;

import fr.formation.proxi1.Presentation.Interaction;

/**
 * Classe representant la carte bleue d'un client. Elle peut etre de deux types:
 * Electron ou Premier.
 * 
 * @author Adminl
 *
 */
public class CarteBancaire {

	public String id;
	public String status;

	/**
	 * Constructeur avec arguments.
	 * 
	 * @param id     Numero de la carte.
	 * @param status Statut de la carte. Par defaut "active" lors de la creation
	 *               d'un client.
	 */
	public CarteBancaire(String id, String status) {
		this.id = id;
		this.status = status;
	}

	/**
	 * Constructeur par defaut.
	 */
	public CarteBancaire() {
		Interaction interaction = new Interaction();
		interaction.display("Saisir numero carte Visa Electron");
		this.id = interaction.read();
		this.status = "active";
	}

	@Override
	public String toString() {
		return ("Carte numero : " + this.id + ". Statut : " + this.status + ".");
	}

}
