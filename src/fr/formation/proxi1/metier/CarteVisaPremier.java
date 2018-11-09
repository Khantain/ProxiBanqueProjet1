package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

public class CarteVisaPremier extends CarteBancaire {

	public CarteVisaPremier(String id, String status) {
		super(id, status);
	}

	public CarteVisaPremier() {
		super();
	}
	
	@Override
	public String toString() {
		return (super.toString() + ". Carte de type premier");
	}

}
