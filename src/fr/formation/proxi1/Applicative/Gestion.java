package fr.formation.proxi1.Applicative;

import fr.formation.proxi1.Bank.ProxiBanqueSI;
import fr.formation.proxi1.IHM.Interaction;
import fr.formation.proxi1.metier.Client;

public class Gestion {

	public Client creerClient() {
		Client client = new Client();
		return client;
	}

	public void modifierClient(Client client) {

	}

	public String lireInfosClient(Client client) {
		String phrase = "";

		return phrase;
	}

	public void suppressionClient(Client client) {

	}

	public void faireVirement(Client clientCrediteur, Client clientDebiteur) {

	}

	public void faireSimulation(Client client) {

	}

	public void start() {

	}
	
	public void creerJeudeTest() {
		ProxiBanqueSI test = new ProxiBanqueSI();
	}

}
