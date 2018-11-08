package fr.formation.proxi1.Applicative;

import java.util.HashMap;
import java.util.Map;

import fr.formation.proxi1.Bank.ProxiBanqueSI;
import fr.formation.proxi1.IHM.Interaction;
import fr.formation.proxi1.metier.Client;
import fr.formation.proxi1.metier.Conseiller;

public class Gestion {

	public Client creerClient() {
		Client client = null;

		return client;
	}

	public void modifierClient(Conseiller conseiller, Client client) {
		Interaction interaction = new Interaction();
		Gestion gestion = new Gestion();
		if (conseiller.clients.size() == 0) {
			interaction.display("Vous n'avez aucun client enregistré. Souhaitez-vous en ajouter un (oui/non) ?");
			if (interaction.read().startsWith("o")) {
				gestion.creerClient();
			}

		} else
			interaction.display("-------- Liste de vos clients ----------");

		for (Client client : conseiller.clients) {
			gestion.lireInfosClient(client);
		}

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

	public Map<Integer, Client> creerDicoClients(Conseiller conseiller) {
		
		Map<Integer, Client> inventaire = new HashMap<>();
		
		Integer[] suite = new Integer[conseiller.clients.size()];
		for (int i = 1; i <= conseiller.clients.size(); i++) {
			suite[i] = i;
		}
		
		for (int i = 0; i <conseiller.clients.size(); i++ ) {
			inventaire.put(suite[i], conseiller.clients.get(i));
		}
		return inventaire;
	}

}
