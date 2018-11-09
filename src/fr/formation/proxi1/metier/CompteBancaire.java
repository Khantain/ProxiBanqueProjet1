package fr.formation.proxi1.metier;

import java.time.LocalDate;

/**
 * Classe representant le compte bancaire d'un client.
 * 
 * @author Adminl
 *
 */
public class CompteBancaire {

	public String id;
	public double solde;
	public LocalDate dateOuverture;

	/**
	 * Constructeur
	 * 
	 * @param id            Le numero du compte.
	 * @param solde         Le solde initial.
	 * @param dateOuverture La date d'ouverture du compte.
	 */
	public CompteBancaire(String id, double solde, LocalDate dateOuverture) {
		this.id = id;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	/** Constructeur par defaut.
	 * 
	 */
	public CompteBancaire() {
		this.id = "";
		this.solde = 0;
		this.dateOuverture = LocalDate.now();
	}
}
