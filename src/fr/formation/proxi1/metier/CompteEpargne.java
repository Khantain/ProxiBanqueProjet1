package fr.formation.proxi1.metier;

import java.time.LocalDate;

import fr.formation.proxi1.Data.Constantes;
import fr.formation.proxi1.IHM.Interaction;

/**
 * 
 * @author Adminl
 *
 *Cette classe caracterise les attributs et methode du Compte Epargne.
 *
 */

public class CompteEpargne extends CompteBancaire {
		
	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur d'initialisation de la classe "CompteEpargne".
	 *
	 */
	
	public CompteEpargne(String id, double solde, LocalDate dateOuverture) {
		super(id, solde, dateOuverture);
	}
	
	/**
	 * 
	 * @author Adminl
	 *
	 *Constructeur par default de la classe "CompteEpargne".
	 *
	 *Permet de definir un compte epargne. Le compte epargne est defini par un identifiant, un solde et une date de creation.
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

	/**
	 * 
	 * @author Adminl
	 *
	 *Permet de redefinir la methode toString de la classe object.
	 *
	 */
	
	@Override
	public String toString() {
		return ("Compte epargne Numero " + this.id + " et au solde de " + this.solde + " euros.");
	}
	
	@Override
	public boolean solvable() {
		return this.solde > 0;
	}

}
