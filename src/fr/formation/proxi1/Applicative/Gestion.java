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

	private ProxiBanqueSI entreprise;
	private boolean running;
	Interaction interaction = new Interaction();

	public Client creerClient() {
		Client client = new Client();
		System.out.println("");
		interaction.display("Saisie validee ! Donnees du nouveau client :");
		System.out.println("\t" + "Nom : " + client.nom);
		System.out.println("\t" + "Prenom : " + client.prenom);
		System.out.println("\t" + "Adresse : " + client.adresse);
		System.out.println("\t" + "Code Postal : " + client.codePostal);
		System.out.println("\t" + "Ville : " + client.ville);
		System.out.println("\t" + "Telephone : " + client.telephone);
		System.out.println("\t" + "Compte courant : " + client.compteCourant);
		System.out.println("\t" + "Compte epargne : " + client.compteEpargne);
		System.out.println("\t" + "Carte Visa : " + client.carteBancaire + "\n");
		return client;
	}

	public void modifierClient() {
		Gestion gestion = new Gestion();
		if (this.entreprise.agences.get(0).conseillers.get(2).clients.size() == 0) {
			interaction.display("Vous n'avez aucun client enregistre. Souhaitez-vous en ajouter un (oui/non) ?");
			if (interaction.read().startsWith("o")) {
				gestion.creerClient();
			} else return;
		}
		interaction.display("-------- Liste de vos clients ----------");
		for (int i = 0; i < this.entreprise.agences.get(0).conseillers.get(2).clients.size(); i++) {
			interaction.display(
					"Client " + (i + 1) + " : " + this.entreprise.agences.get(0).conseillers.get(2).clients.get(i));
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

		this.entreprise = this.creerJeudeTest();
		this.running = true;
		Conseiller conseiller = new Conseiller();
		this.entreprise.agences.get(0).conseillers.add(conseiller);

		String choix = "";

		while (this.running) {
			choix = interaction.mainMenu();

			switch (choix) {
			case "1":
				Client client = this.creerClient();
				entreprise.agences.get(0).conseillers.get(2).clients.add(client);
				break;
			case "2":
				interaction.Menugererclient();
				break;
			case "3":
				this.running = false;
				break;
			}
		}

//	scanner.close();
	}

	public ProxiBanqueSI creerJeudeTest() {
		ProxiBanqueSI entreprise;
		entreprise = new ProxiBanqueSI();
		return entreprise;

	}

}
