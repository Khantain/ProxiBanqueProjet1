package fr.formation.proxi1.metier;

public class CarteVisaPremier extends CarteBancaire {

	public CarteVisaPremier(String id, String status) {
		super(id, status);
	}

	@Override
	public String toString() {
		return ("Carte Visa Premier " + this.id);
	}

}
