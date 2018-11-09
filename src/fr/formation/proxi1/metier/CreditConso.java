package fr.formation.proxi1.metier;

/**
 * 
 * @author Adminl
 *
 *Cette classe caracterise les attributs et methode du credit consommation.
 *
 */

public class CreditConso extends Credit {
	
	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur par default de la classe "CreditConso".
	 *
	 */
	
	public CreditConso() {
		super();
	}

	/**
	 * 
	 * @author Adminl
	 *
	 *Permet de redefinir la methode toString de la classe object.
	 *
	 */
	
	@Override
	public String toString() {
		return ("Credit conso d'une duree de " + this.duree + " ans. Mensualite : " + this.mensualite + " euros.");
	}

}
