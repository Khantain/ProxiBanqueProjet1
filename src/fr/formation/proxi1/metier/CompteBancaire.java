package fr.formation.proxi1.metier;

import java.time.LocalDate;

/**
 * @author Adminl
 *
 */
public class CompteBancaire {

	public String id;
	public double solde;
	public LocalDate dateOuverture;

	/**
	 * @param id
	 * @param solde
	 * @param dateOuverture
	 */
	public CompteBancaire(String id, double solde, LocalDate dateOuverture) {
		this.id = id;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	/**
	 * 
	 */
	public CompteBancaire() {
		this.id = "";
		this.solde = 0;
		this.dateOuverture = LocalDate.now();
	}

	/**
	 * @return
	 */
	public boolean solvable() {
		return true;
	}
}
