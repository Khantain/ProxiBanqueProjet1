package fr.formation.proxi1.metier;

import java.time.LocalDate;

import fr.formation.proxi1.IHM.Interaction;

/**
 * Classe specialisant la classe CompteBancaire.
 * 
 * @author Adminl
 *
 */
public class CompteCourant extends CompteBancaire {

	/**
	 * Constructeur avec arguemnts.
	 * 
	 * @param id            L'identifiant du compte
	 * @param solde         Le solde initial.
	 * @param dateOuverture La date d'ouverture du compte.
	 */
	public CompteCourant(String id, double solde, LocalDate dateOuverture) {
		super(id, solde, dateOuverture);
	}

	/**
	 * Constructeur sans argument permettant de choisir tous les attributs de la
	 * classe.
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

	@Override
	public String toString() {
		return ("Compte courant Numero " + this.id + " et au solde de " + this.solde + " euros.");
	}

}
