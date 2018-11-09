package fr.formation.proxi1.metier;

import java.time.LocalDate;

public class CompteCourant extends CompteBancaire {

	public CompteCourant(String id, int solde, LocalDate dateOuverture) {
		super(id, solde, dateOuverture);
	}

	public CompteCourant() {
		super();
	}
	
	@Override
	public String toString() {
		return ("Compte epargne Numero " + this.id + " et au solde de " + this.solde + " euros.");
	}
}
