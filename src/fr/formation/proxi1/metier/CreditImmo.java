package fr.formation.proxi1.metier;

/**
 * 
 * @author Adminl
 *
 *Cette classe caracterise les attributs et methode du credit immobilier.
 *
 */

public class CreditImmo extends Credit {
	
	public String type;

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur par default de la classe "CreditImmo".
	 *
	 */
	
	public CreditImmo() {
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
		return ("Credit immobilier d'une duree de " + this.duree + " ans. Mensualite : " + this.mensualite + " euros.");
	}
	
	

}
