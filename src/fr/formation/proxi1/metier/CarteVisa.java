package fr.formation.proxi1.metier;

public class CarteVisa extends CarteBancaire {

	public CarteVisa(String id, String status) {
		super(id, status);
	}


	@Override
	public String toString() {
		return ("Carte Visa Electron " + this.id);
	}
}
