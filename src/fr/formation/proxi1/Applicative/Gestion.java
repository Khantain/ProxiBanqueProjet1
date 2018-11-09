package fr.formation.proxi1.Applicative;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.formation.proxi1.Bank.ProxiBanqueSI;
import fr.formation.proxi1.IHM.Interaction;
import fr.formation.proxi1.metier.Agence;
import fr.formation.proxi1.metier.Client;
import fr.formation.proxi1.metier.Conseiller;
import fr.formation.proxi1.metier.Gerant;

public class Gestion {

	public void creerClient(Conseiller conseiller) {
		Client client = new Client();
		conseiller.clients.add(client);
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

		for (Client client2 : conseiller.clients) {
			gestion.lireInfosClient(client2);
		}

	}

	public String lireInfosClient(Client client) {

		return "";
	}

	public void suppressionClient(Client client) {

	}

	public void faireVirement(Client clientCrediteur, Client clientDebiteur) {

	}

	public void faireSimulation(Client client) {

	}
	
	// zone de test 
	public void start() {
		this.creerJeudeTest();
		Conseiller conseiller = new Conseiller();
		Interaction interaction = new Interaction();
		interaction.mainMenu(conseiller);
//	scanner.close();
	}

	public void creerJeudeTest() {

		ProxiBanqueSI proxiTest = new ProxiBanqueSI("test");
		System.out.println(proxiTest.agences);
	}

	
	
	
	
	
	public Map<Integer, Client> creerDicoClients(Conseiller conseiller) {

		Map<Integer, Client> inventaire = new HashMap<>();

		Integer[] suite = new Integer[conseiller.clients.size()];
		for (int i = 0; i <= conseiller.clients.size(); i++) {
			suite[i] = i+1;
		}

		for (int i = 0; i < conseiller.clients.size(); i++) {
			inventaire.put(suite[i], conseiller.clients.get(i));
		}
		return inventaire;
	}

}
