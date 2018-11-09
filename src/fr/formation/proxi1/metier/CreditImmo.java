package fr.formation.proxi1.metier;

import fr.formation.proxi1.Persistence.Constantes;
import fr.formation.proxi1.Presentation.Interaction;

/**
 * La classe CreditImmo represente un creditimmobilier potentiellement accorde a
 * un client. Un credit est compose d'une duree et d'un montant initial et du
 * typp de bien vise (appartement, maison...). Le montant a rembourser par le
 * client est calcule a partir d'un pourcentage par defaut de 5%.
 * 
 * @author Adminl
 *
 */
public class CreditImmo extends Credit {

	public String type;

	/**
	 * Constructeur sans argument permettant de choisir tous les attributs de la
	 * classe.
	 * 
	 */
	public CreditImmo() {
		super();
		Interaction interaction = new Interaction();
		interaction.display("Type de bien envisage :");
		this.type = interaction.read();
		this.montantDu = this.montantInital + this.montantInital * (Constantes.TAUX_RENDEMENT_CREDIT_IMMO / 100);
		interaction.display("Montant que le client devra rembourser : " + this.montantDu);
		this.mensualite = this.montantDu / (this.duree * 12);
		interaction.display("Versement par le client chaque mois : " + this.mensualite + " euros pendant "
				+ (this.duree * 12) + " mois.");
	}

	@Override
	public String toString() {
		return ("Credit immobilier d'une duree de " + this.duree + " ans. Mensualite : " + this.mensualite + " euros.");
	}

}
