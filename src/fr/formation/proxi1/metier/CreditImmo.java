package fr.formation.proxi1.metier;

public class CreditImmo extends Credit {
	
	public String type;

	public CreditImmo() {
		super();
	}

	@Override
	public String toString() {
		return ("Credit immobilier d'une duree de " + this.duree + " ans. Mensualite : " + this.mensualite + " euros.");
	}
	
	

}
