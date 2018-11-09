package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

public class CarteVisa extends CarteBancaire {

	public CarteVisa(String id, String status) {
		super(id, status);
	}


	public CarteVisa() {
		Interaction interaction = new Interaction();
		interaction.display("Saisir numero carte Visa Electron");
		this.id = interaction.read();
		this.status = "active";
	}


	@Override
	public String toString() {
		return ("Carte Visa Electron " + this.id);
	}
}
