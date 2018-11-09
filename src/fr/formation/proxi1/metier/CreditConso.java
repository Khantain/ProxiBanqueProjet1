package fr.formation.proxi1.metier;

import fr.formation.proxi1.Data.Constantes;
import fr.formation.proxi1.IHM.Interaction;

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
		this.montantDu = this.montantInital + this.montantInital*(Constantes.TAUX_RENDEMENT_CREDIT_CONSO / 100);
		Interaction interaction = new Interaction();
		interaction.display("Montant que le client devra rembourser : " + this.montantDu);
		this.mensualite = this.montantDu / (this.duree * 12);
		interaction.display("Versement par le client chaque mois : " + this.mensualite);
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
