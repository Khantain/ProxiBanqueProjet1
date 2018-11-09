package fr.formation.proxi1.Bank;

import java.util.ArrayList;
import java.util.List;
import fr.formation.proxi1.metier.Agence;

/**
 * @author Adminl
 *
 */
public class ProxiBanqueSI {

	public List<Agence> agences;

	/**
	 * Constructeur.
	 * 
	 * @param La liste d'agences de l'entreprise sous forme de liste.
	 */
	public ProxiBanqueSI(List<Agence> agences) {
		this.agences = agences;
	}

	/**
	 * Constructeur permettant de creer une agence de test avec un gerant test, deux
	 * conseillers test et deux clients test.
	 * 
	 */
	public ProxiBanqueSI() {
		this.agences = new ArrayList<>();
		Agence agenceTest = new Agence("32AB4");
		this.agences.add(agenceTest);
	}
}
