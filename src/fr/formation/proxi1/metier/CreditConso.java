package fr.formation.proxi1.metier;

import fr.formation.proxi1.Data.Constantes;
import fr.formation.proxi1.IHM.Interaction;

/**
 * La classe CreditConso represente un credit consommation potentiellement
 * accorde a un client. Un credit est compose d'une duree et d'un montant
 * initial. Le montant a rembourser par le client est calcule a partir d'un
 * pourcentage par defaut de 3%.
 * 
 * @author Adminl
 *
 */
public class CreditConso extends Credit {

	/**
	 * Constructeur sans argument permettant de choisir tous les attributs de la
	 * classe.
	 * 
	 */
	public CreditConso() {
		super();
		this.montantDu = this.montantInital + this.montantInital * (Constantes.TAUX_RENDEMENT_CREDIT_CONSO / 100);
		Interaction interaction = new Interaction();
		interaction.display("Montant que le client devra rembourser : " + this.montantDu);
		this.mensualite = this.montantDu / (this.duree * 12);
		interaction.display("Versement par le client chaque mois : " + this.mensualite);
	}

	@Override
	public String toString() {
		return ("Credit conso d'une duree de " + this.duree + " ans. Mensualite : " + this.mensualite + " euros.");
	}

}
