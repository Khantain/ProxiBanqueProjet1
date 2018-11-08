package fr.formation.proxi1.metier;

import java.time.LocalDate;

import fr.formation.proxi1.Data.Constants;

public class CompteEpargne extends CompteBancaire {
	
	public CompteEpargne(String id, double solde, LocalDate dateOuverture) {
		super(id, solde, dateOuverture);
	}

	public CompteEpargne() {
		// TODO Auto-generated constructor stub
	}

	public int taux = Constants.tauxCompteEpargne;

}
