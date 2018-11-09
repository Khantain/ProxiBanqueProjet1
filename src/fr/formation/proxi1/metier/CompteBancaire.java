package fr.formation.proxi1.metier;

import java.time.LocalDate;

/**
 * 
 * @author Adminl
 *
 *Cette classe caracterise les attributs et methode du Compte Bancaire.
 *
 */

public class CompteBancaire {


	public String id;
	public double solde;
	public LocalDate dateOuverture;

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur d'initialisation de la classe "CompteBancaire".
	 *
	 */
	
	public CompteBancaire(String id, double solde, LocalDate dateOuverture) {
		this.id = id;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur par default de la classe "CompteBancaire".
	 *
	 */
	
	public CompteBancaire() {
		this.id = "";
		this.solde = 0;
		this.dateOuverture = LocalDate.now();
	}
	
	public boolean solvable() {
		return true;
	}
}
