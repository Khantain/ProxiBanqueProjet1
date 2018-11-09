package fr.formation.proxi1.Applicative;

import fr.formation.proxi1.Bank.ProxiBanqueSI;
import fr.formation.proxi1.IHM.Interaction;
import fr.formation.proxi1.metier.CarteBancaire;
import fr.formation.proxi1.metier.Client;
import fr.formation.proxi1.metier.CompteBancaire;
import fr.formation.proxi1.metier.CompteCourant;
import fr.formation.proxi1.metier.CompteEpargne;
import fr.formation.proxi1.metier.Conseiller;

public class Gestion {

	private ProxiBanqueSI entreprise;
	private boolean running;
	Interaction interaction = new Interaction();

	
	public Client creerClient() {
		Client client = new Client();
		System.out.println("");
		interaction.display("Saisie validee ! Donnees du nouveau client :");
		this.afficherClient(client);
		return client;
	}

	
	public void afficherClient(Client client) {
		System.out.println("\t" + "Nom : " + client.nom);
		System.out.println("\t" + "Prenom : " + client.prenom);
		System.out.println("\t" + "Adresse : " + client.adresse);
		System.out.println("\t" + "Code Postal : " + client.codePostal);
		System.out.println("\t" + "Ville : " + client.ville);
		System.out.println("\t" + "Telephone : " + client.telephone);
		System.out.println("\t" + "Compte courant : " + client.compteCourant);
		System.out.println("\t" + "Compte epargne : " + client.compteEpargne);
		System.out.println("\t" + "Carte Visa : " + client.carteBancaire + "\n");
	}

	
	public void modifierClient(Client client) {
		String[] attributsClient = { "Nom", "Prenom", "Adresse", "Code postal", "Ville", "Telephone", "Compte Courant",
				"Compte Epargne", "Carte Visa" };
		interaction.display("Quelle information souhaitez vous modifier ? Saisissez le chiffre correspondant \n");

		for (int i = 0; i < attributsClient.length; i++) {
			interaction.display("\t" + (i + 1) + "    -    " + attributsClient[i]);
		}

		int rep = Integer.parseInt(interaction.read());
		switch (rep) {
		case 1:
			interaction.display("Entrez le nouveau nom :");
			client.nom = interaction.read();
			break;
		case 2:
			interaction.display("Entrez le nouveau prenom :");
			client.prenom = interaction.read();
			break;
		case 3:
			interaction.display("Entrez la nouvelle adresse :");
			client.adresse = interaction.read();
			break;
		case 4:
			interaction.display("Entrez le nouveau code postal :");
			client.codePostal = Integer.parseInt(interaction.read());
			break;
		case 5:
			interaction.display("Entrez la nouvelle ville :");
			client.ville = interaction.read();
			break;
		case 6:
			interaction.display("Entrez le nouveau numero de telephone :");
			client.telephone = Long.parseLong(interaction.read());
			break;
		case 7:
			interaction.display("Compte courant actuel du client :\t " + client.compteCourant.toString());
			interaction.display("Creation d'un nouveau compte courant");
			client.compteCourant = new CompteCourant();
			break;
		case 8:
			interaction.display("Compte epargne actuel du client :\t " + client.compteCourant.toString());
			interaction.display("Creation d'un nouveau compte epargne");
			client.compteEpargne = new CompteEpargne();
			break;
		case 9:
			interaction.display("Carte actuelle du client :\t " + client.compteCourant.toString());
			interaction.display("Creation d'une nouvelle carte bancaire et descativation de l'ancienne");
			client.carteBancaire = new CarteBancaire();
			break;

		}

	}

	public int listerClients() {
		this.interaction.display(
				"******* Liste de vos clients. Saisissez le chiffre correspondant au client d'interet **********");
		int indexClient;
		for (int i = 0; i < this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.size(); i++) {
			if (!this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.get(i).archive)
			interaction.display(
					"\t" + (i + 1) + "    -    " + this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.get(i));
		}
		indexClient = Integer.parseInt(interaction.read()) - 1;

		return indexClient;
	}

	public void suppressionClient() {
		
//		interaction.display("Il y a " + this.entreprise.agences.get(0).conseillers.get(2).clients.size()
//				+ " client(s) dans votre liste.");
//		int index3 = this.listerClients();
//		this.entreprise.agences.get(0).conseillers.get(2).clients.get(index3).archive = true;
//		interaction.display("Client supprime de la liste.\n");

	}

	public void faireVirement(Client clientCredite, Client clientDebite) {
		interaction.display("Indiquez le montant du virement :");
		double montant = Double.parseDouble(interaction.read());
		
		interaction.display("Pour le client a debiter, taper 'C' pour prendre depuis le compte courant et 'E' pour le compte epargne :");
		String rep = interaction.read().toLowerCase().substring(0,1);
		CompteBancaire compteDebite = null;
		if (rep.equals("c")) {
			compteDebite = clientDebite.compteCourant;
		} else compteDebite = clientDebite.compteEpargne;
		
		interaction.display("Pour le client a crediter, taper 'C' pour prendre depuis le compte courant et 'E' pour le compte epargne :");
		String rep2 = interaction.read().toLowerCase().substring(0,1);
		CompteBancaire compteCredite = null;
		if (rep.equals("c")) {
			compteCredite = clientDebite.compteCourant;
		} else compteCredite = clientDebite.compteEpargne;

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
				Client clientCree = this.creerClient();
				this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.add(clientCree);
				break;

			case "2":
				String choixSousMenu = interaction.Menugererclient();

				switch (choixSousMenu) {
				
			//Affichage du resume d'un client.
				case "1":
					int index = this.listerClients();
					Client clientSouhaite = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.get(index);
					this.afficherClient(clientSouhaite);
					break;
					
			//Modification d'un attribut du client selectionne.
				case "2":
					int index2 = this.listerClients();
					Client clientAModifier = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.get(index2);
					this.modifierClient(clientAModifier);
					break;
					
			//Suppression d'un client. Retour au menu principal si absence de clients dans la liste.
				case "3":
					if (this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.size() == 0) {
						interaction.display("Erreur. Votre liste ne contient aucun client. Retour au menu principal.");
						break;
					}
					this.suppressionClient();

					
					break;
					
			//Virement entre deux comptes. Le virement peut concerner le meme client.
				case "4":
					interaction.display("Indiquez le client a debiter : \n");
					int indexClientDebite = this.listerClients();
					Client clientDebite = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis
							.get(indexClientDebite);

					String[] comptes = { "Compte Courant", "Compte Epargne" };
					for (int i = 0; i < comptes.length; i++) {
						interaction.display("\t" + (i + 1) + "    -    " + comptes[i]);
					}

					interaction.display("Indiquez le client a crediter : \n");
					int indexClientCredite = this.listerClients();
					Client clientCredite = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis
							.get(indexClientCredite);
					
					this.faireVirement(clientCredite, clientDebite);
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
