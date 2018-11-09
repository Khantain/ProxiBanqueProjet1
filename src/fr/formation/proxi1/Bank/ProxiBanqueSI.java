package fr.formation.proxi1.Bank;

import java.util.ArrayList;
import java.util.List;

import fr.formation.proxi1.metier.Agence;

public class ProxiBanqueSI {

	public List<Agence> agences;

	public ProxiBanqueSI(List<Agence> agences) {
		this.agences = agences;

	}

	public ProxiBanqueSI() {

		this.agences = new ArrayList<>();
		Agence agenceTest = new Agence("AgenceTest");
		this.agences.add(agenceTest);

	}
}
