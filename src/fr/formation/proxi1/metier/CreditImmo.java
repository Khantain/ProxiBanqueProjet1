package fr.formation.proxi1.metier;

import fr.formation.proxi1.Data.Constantes;
import fr.formation.proxi1.IHM.Interaction;

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
		Interaction interaction = new Interaction();
		interaction.display("Type de bien envisage :");
		this.type = interaction.read();
		this.montantDu = this.montantInital + this.montantInital*(Constantes.TAUX_RENDEMENT_CREDIT_IMMO / 100);
		interaction.display("Montant que le client devra rembourser : " + this.montantDu);
		this.mensualite = this.montantDu / (this.duree * 12);
		interaction.display("Versement par le client chaque mois : " + this.mensualite + " euros pendant " + (this.duree*12) + " mois.");
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
