package fr.formation.proxi1.metier;

import java.time.LocalDate;

import fr.formation.proxi1.Data.Constants;
import fr.formation.proxi1.IHM.Interaction;

public class CompteEpargne extends CompteBancaire {
	
	public CompteEpargne(String id, double solde, LocalDate dateOuverture) {
		super(id, solde, dateOuverture);
	}

	public CompteEpargne() {
		Interaction interaction = new Interaction();
		interaction.display("Saisir id du compte epargne");
		this.id = interaction.read();
		interaction.display("Saisir solde initial du compte epargne");
		this.solde = -1;
		while (this.solde <= -1) {
		try {
			if (this.solde < -1) {
				interaction.display("Chiffre positif demande");
			}
			this.solde = Double.parseDouble(interaction.read());
		  } catch (NumberFormatException e) {
		    System.out.println("Chiffre attendu !");
		  }
		}
		this.dateOuverture = LocalDate.now();
	}

	public int taux = Constants.tauxCompteEpargne;

	@Override
	public String toString() {
		return ("Compte epargne Numero " + this.id + " et au solde de " + this.solde + " euros.");
	}
	
	

}
