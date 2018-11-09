package fr.formation.proxi1.Applicative;

import fr.formation.proxi1.Bank.ProxiBanqueSI;
import fr.formation.proxi1.IHM.Interaction;
import fr.formation.proxi1.metier.Client;
import fr.formation.proxi1.metier.Conseiller;

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

	public void modifierClient(Client client) {
		System.out.println("Je suis dans la methode modifier client !!!!!");
		
	}

	public int listerClients() {
		int indexClient;
		for (int i = 0; i < this.entreprise.agences.get(0).conseillers.get(2).clients.size(); i++) {
			interaction.display(
					"Client " + (i + 1) + " : " + this.entreprise.agences.get(0).conseillers.get(2).clients.get(i));
		}
		indexClient = Integer.parseInt(interaction.read()) - 1;

		return indexClient;
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
				this.entreprise.agences.get(0).conseillers.get(2).clients.add(client);
				break;

			case "2":
				String choixSousMenu = interaction.Menugererclient();

				switch (choixSousMenu) {
				case "1":
					int index = this.listerClients();
					interaction
							.display(this.entreprise.agences.get(0).conseillers.get(2).clients.get(index).toString());
					break;
				case "2":
					int index2 = this.listerClients();
					Client clientAModifier = this.entreprise.agences.get(0).conseillers.get(2).clients.get(index2);
					this.modifierClient(clientAModifier);
					break;
				case "3":
					int index3 = this.listerClients();
					this.entreprise.agences.get(0).conseillers.get(2).clients.remove(index3);
					break;
				case "4":
					interaction.display("Indiquez le client a debiter : ");
					int indexClientDebiteur = this.listerClients();
					interaction.display("Indiquez le client a crediter : ");
					int indexClientCrediteur = this.listerClients();

					break;
				case "5":
					break;
				case "6":
					break;
				}
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
