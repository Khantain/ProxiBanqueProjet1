package fr.formation.proxi1.Bank;

import java.util.ArrayList;
import java.util.List;
import fr.formation.proxi1.metier.Agence;

/***
 * 
 * @author Adminl
 *
 *Cette classe caracterise les attributs et methode de l'application ProxiBanqueSI.
 *
 */

public class ProxiBanqueSI {

	public List<Agence> agences;

	/***
	 * 
	 * @author Adminl
	 *
	 *Constructeur d'initialisation de la classe "ProxiBanqueSI".
	 *
	 */
	
	public ProxiBanqueSI(List<Agence> agences) {
		this.agences = agences;
	}

	/***
	 * 
	 * @author Adminl
	 *
	 *Constructeur par default de la classe "Gerant".
	 *
	 */
	
	public ProxiBanqueSI() {
		this.agences = new ArrayList<>();
		Agence agenceTest = new Agence("32AB4");
		this.agences.add(agenceTest);
	}
}
