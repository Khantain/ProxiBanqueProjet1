package fr.formation.proxi1.Persistence;

import java.util.ArrayList;
import java.util.List;
import fr.formation.proxi1.metier.Agence;

/**
 * Classe representant l'entreprise. Elle est composee d'un reseau d'agences.
 * 
 * @author Adminl
 *
 */
public class ReseauAgences {

	public List<Agence> agences;

	/**
	 * Constructeur.
	 * 
	 * @param La liste d'agences de l'entreprise sous forme de liste.
	 */
	public ReseauAgences(List<Agence> agences) {
		this.agences = agences;
	}

	/**
	 * Constructeur permettant de creer une agence de test avec un gerant test, deux
	 * conseillers test et deux clients test.
	 * 
	 */
	public ReseauAgences() {
		this.agences = new ArrayList<>();
		Agence agenceTest = new Agence("32AB4");
		this.agences.add(agenceTest);
	}
}
