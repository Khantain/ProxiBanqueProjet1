package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

/**
 * La classe Credit represente un credit à la consommation ou un credit
 * immobilier. Chaque credit est soumis a un taux different selon le type de
 * credit.
 * 
 * @author Adminl
 *
 */
public class Credit {

	public int duree;
	public double montantInital;
	public double montantDu;
	public double mensualite;

	/**
	 * Constructeur sans argument permettant de choisir tous les attributs de la
	 * classe.
	 * 
	 */
	public Credit() {
		Interaction interaction = new Interaction();
		interaction.display("Creation d'un nouveau credit");
		interaction.display("Montant prete au client");
		this.montantInital = Double.parseDouble(interaction.read());
		interaction.display("Duree du pret en annees");
		this.duree = Integer.parseInt(interaction.read());

	}

}
