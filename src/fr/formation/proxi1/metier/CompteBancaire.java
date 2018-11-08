package fr.formation.proxi1.metier;

import java.time.LocalDate;

public class CompteBancaire {


	public String id;
	public double solde;
	public LocalDate dateOuverture;

	public CompteBancaire(String id, double solde, LocalDate dateOuverture) {
		this.id = id;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
	}
}
