package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

public class CarteVisaPremier extends CarteBancaire {

	public CarteVisaPremier(String id, String status) {
		super(id, status);
	}

	public CarteVisaPremier() {
		Interaction interaction = new Interaction();
		interaction.display("Saisir numero carte Visa Premier");
		this.id = interaction.read();
		this.status = "active";
	}
	
	@Override
	public String toString() {
		return ("Carte Visa Premier " + this.id);
	}

}
