package fr.formation.proxi1.metier;


/**
 * Classe specialisant la classe CarteBancaire.
 * 
 * @author Adminl
 *
 */
public class CarteVisaPremier extends CarteBancaire {

	/**
	 * Constructeur avec arguments.
	 * 
	 * @param id     Numero de la carte.
	 * @param status Statut de la carte. Par defaut "active" lors de la creation
	 *               d'un client.
	 */
	public CarteVisaPremier(String id, String status) {
		super(id, status);
	}

	/**
	 * 
	 */
	public CarteVisaPremier() {
		super();
	}

	@Override
	public String toString() {
		return (super.toString() + " Carte de type premier.");
	}

}
