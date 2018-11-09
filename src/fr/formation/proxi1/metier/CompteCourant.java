package fr.formation.proxi1.metier;

import java.time.LocalDate;

import fr.formation.proxi1.IHM.Interaction;

public class CompteCourant extends CompteBancaire {

	public CompteCourant(String id, int solde, LocalDate dateOuverture) {
		super(id, solde, dateOuverture);
	}

	public CompteCourant() {
			Interaction interaction = new Interaction();
			interaction.display("Saisir id du compte courant");
			this.id = interaction.read();
			interaction.display("Saisir solde initial du compte courant");
			this.solde = Double.parseDouble(interaction.read());
			this.dateOuverture = LocalDate.now();
	}
	
	@Override
	public String toString() {
		return ("Compte courant Numero " + this.id + " et au solde de " + this.solde + " euros.");
	}
}
