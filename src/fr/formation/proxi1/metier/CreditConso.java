package fr.formation.proxi1.metier;

public class CreditConso extends Credit {
	
	
	
	public CreditConso() {
		super();
	}

	@Override
	public String toString() {
		return ("Credit conso d'une duree de " + this.duree + " ans. Mensualite : " + this.mensualite + " euros.");
	}

}
