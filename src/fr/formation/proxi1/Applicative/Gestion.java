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
	
	ProxiBanqueSI entreprise;
	
	private boolean running;

	public Client creerClient() {
		Client client = new Client();
		System.out.println(client);
		System.out.println("Nombre de clients avant ajout : " + this.entreprise.agences.get(0).conseillers.get(2).clients.size());
		return client;
	}

	public void modifierClient(Conseiller conseiller, Client client) {
		Interaction interaction = new Interaction();
		Gestion gestion = new Gestion();
		if (conseiller.clients.size() == 0) {
			interaction.display("Vous n'avez aucun client enregistre. Souhaitez-vous en ajouter un (oui/non) ?");
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

		return client.toString();
	}

	public void suppressionClient(Client client) {

	}

	public void faireVirement(Client clientCrediteur, Client clientDebiteur) {

	}

	public void faireSimulation(Client client) {

	}
	
	public void start() {
		
		this.creerJeudeTest();
		this.running = true;
		Conseiller conseiller = new Conseiller();
		this.entreprise.agences.get(0).conseillers.add(conseiller);
		System.out.println("Nombre de conseillers : " + this.entreprise.agences.get(0).conseillers.size());
		Interaction interaction = new Interaction();
		interaction.mainMenu();
//	scanner.close();
	}

	public void creerJeudeTest() {

		this.entreprise = new ProxiBanqueSI();

	}

	


}
