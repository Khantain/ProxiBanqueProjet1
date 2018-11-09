package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

public class CarteVisa extends CarteBancaire {

	public CarteVisa(String id, String status) {
		super(id, status);
	}


	public CarteVisa() {
		super();
		}

	@Override
	public String toString() {
		return (super.toString() + ". Carte de type electron");
	}
}
