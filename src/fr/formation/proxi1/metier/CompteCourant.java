package fr.formation.proxi1.metier;

import java.time.LocalDate;

import fr.formation.proxi1.Applicative.Gestion;
import fr.formation.proxi1.IHM.Interaction;

/**
 * 
 * @author Adminl
 *
 *Cette classe caracterise les attributs et methode du Compte Courant.
 *
 */

public class CompteCourant extends CompteBancaire {

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur d'initialisation de la classe "CompteCourant".
	 *
	 */
	
	public CompteCourant(String id, double solde, LocalDate dateOuverture) {
		super(id, solde, dateOuverture);
	}

	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur par default de la classe "CompteCourant".
	 *
	 */
	
	public CompteCourant() {
			Interaction interaction = new Interaction();
			interaction.display("Saisir id du compte courant");
			this.id = interaction.read();
			interaction.display("Saisir solde initial du compte courant");
			this.solde = -1;
			while (this.solde <= -1) {
			try {
				if (this.solde < -1) {
					interaction.display("Chiffre positif demande");
				}
				this.solde = Double.parseDouble(interaction.read());
			  } catch (NumberFormatException e) {
			    System.out.println("Chiffre attendu !");
			  }
			}
			this.dateOuverture = LocalDate.now();
	}
	
	/**
	 * 
	 * @author Adminl
	 *
	 *Permet de redefinir la methode toString de la classe "Object".
	 *
	 */
	
	@Override
	public String toString() {
		return ("Compte courant Numero " + this.id + " et au solde de " + this.solde + " euros.");
	}
}
