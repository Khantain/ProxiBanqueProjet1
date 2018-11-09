package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

/**
 * 
 * @author Adminl
 *
 *         A REMPLIR La classe "Credit" ne poss�de pas de m�thode elle n'est l�
 *         que dans le cas ou l'utilisateur veux faire des simulations de
 *         cr�dit.
 *
 */

public class Credit {
	
	public int duree;
	public double montantInital;
	public double montantDu;
	public double mensualite;
	
	public Credit() {
		Interaction interaction = new Interaction();
		interaction.display("Creation d'un nouveau credit");
		interaction.display("Montant prete au client");
		this.montantInital = Double.parseDouble(interaction.read());
		interaction.display("Duree du pret en annees");
		this.duree = Integer.parseInt(interaction.read());

	}
	
	
}
