package fr.formation.proxi1.metier;

import java.time.LocalDate;

import fr.formation.proxi1.Data.Constantes;
import fr.formation.proxi1.IHM.Interaction;

/**
 * Classe avec un taux de rendement specialisant la classe CompteBancaire.
 * 
 * @author Adminl
 *
 */
public class CompteEpargne extends CompteBancaire {

	/**
	 * Constructeur avec arguemnts.
	 * 
	 * @param id            L'identifiant du compte
	 * @param solde         Le solde initial.
	 * @param dateOuverture La date d'ouverture du compte.
	 */
	public CompteEpargne(String id, double solde, LocalDate dateOuverture) {
		super(id, solde, dateOuverture);
	}

	/**
	 * Constructeur sans argument permettant de choisir tous les attributs de la
	 * classe.
	 * 
	 */
	public CompteEpargne() {
		Interaction interaction = new Interaction();
		interaction.display("Saisir id du compte epargne");
		this.id = interaction.read();
		interaction.display("Saisir solde initial du compte epargne");
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

	@Override
	public String toString() {
		return ("Compte epargne Numero " + this.id + " et au solde de " + this.solde + " euros.");
	}

}
