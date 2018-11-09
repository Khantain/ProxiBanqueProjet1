package fr.formation.proxi1.Applicative;

import fr.formation.proxi1.Bank.ProxiBanqueSI;
import fr.formation.proxi1.Data.Constantes;
import fr.formation.proxi1.IHM.Interaction;
import fr.formation.proxi1.metier.CarteBancaire;
import fr.formation.proxi1.metier.Client;
import fr.formation.proxi1.metier.CompteCourant;
import fr.formation.proxi1.metier.CompteEpargne;
import fr.formation.proxi1.metier.Conseiller;
import fr.formation.proxi1.metier.Credit;
import fr.formation.proxi1.metier.CreditConso;
import fr.formation.proxi1.metier.CreditImmo;

/**Classe contenant tous les traitements effectues sur les clients du conseiller nouvellement arrive.
 * @author Adminl
 *
 */
public class Gestion {
//attributs de la classe
	private ProxiBanqueSI entreprise;
	private boolean running;
	Interaction interaction = new Interaction();

	/** Cree un client dont toutes les informations sont saisies par l'utilisateur.
	 * @return Le Client cree.
	 */
	public Client creerClient() {
		Client client = new Client();
		System.out.println("");
		interaction.display("Saisie validee ! Donnees du nouveau client :");
		this.afficherClient(client);
		return client;
	}

	/**Affiche le resume d'un client enregistre dans la liste.
	 * @param client Le client a afficher.
	 */
	public void afficherClient(Client client) {
		interaction.display("\t" + "Nom : " + client.nom);
		interaction.display("\t" + "Prenom : " + client.prenom);
		interaction.display("\t" + "Adresse : " + client.adresse);
		interaction.display("\t" + "Code Postal : " + client.codePostal);
		interaction.display("\t" + "Ville : " + client.ville);
		interaction.display("\t" + "Telephone : " + client.telephone);
		interaction.display("\t" + "Compte courant : " + client.compteCourant);
		interaction.display("\t" + "Compte epargne : " + client.compteEpargne);
		interaction.display("\t" + "Carte Visa : " + client.carteBancaire + "\n");
		interaction.display("\t" + "Credit en cours ? : " + (client.avecCredit ? "Oui" : "Non") + "\n");
	}

	/** Permet de modifier un attribut particulier d'un client a partir d'un menu.
	 * @param client Le client dont une des donnees est a modifier.
	 */
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
			interaction.display("Compte epargne actuel du client :\t " + client.compteEpargne.toString());
			interaction.display("Creation d'un nouveau compte epargne");
			client.compteEpargne = new CompteEpargne();
			break;
		case 9:
			interaction.display("Carte actuelle du client :\t " + client.carteBancaire.toString());
			interaction.display("Creation d'une nouvelle carte bancaire et suppression de l'ancienne");
			client.carteBancaire = new CarteBancaire();
			break;

		}

	}

	/** Affiche l'ensemble des clients parmi la liste.
	 * @return Un entier indiquant l'index du client choisi parmi la liste.
	 */
	public int listerClients() {
		if (this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.size() == 0) {
			interaction.display("Aucun client à afficher. Veuillez d'abord ajouter un client.");
			return -1;
		}
		this.interaction.display(
				"******* Liste de vos clients. Saisissez le chiffre correspondant au client d'interet **********");
		int indexClient;
		for (int i = 0; i < this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.size(); i++) {
			if (!this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.get(i).archive)
				interaction.display("\t" + (i + 1) + "    -    "
						+ this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.get(i));
		}
		indexClient = Integer.parseInt(interaction.read()) - 1;
		return indexClient;
	}

	public void suppressionClient() {

		interaction.display("Il y a " + this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.size()
				+ " client(s) dans votre liste.");
		int index3 = this.listerClients();
		Client clientSupprime = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.get(index3);
		clientSupprime.carteBancaire.status = "desactive";
		this.entreprise.agences.get(0).conseillers.get(2).clientsArchives.add(clientSupprime);
		this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.remove(index3);
		interaction.display("Client supprime de la liste.\n");

	}

	public void faireVirement(Client clientCredite, Client clientDebite) {
		interaction.display("Indiquez le montant du virement :");
		double montant = Double.parseDouble(interaction.read());

		interaction.display(
				"Pour le client a DEBITER, taper 'C' pour prendre depuis le compte courant et 'E' pour le compte epargne :");
		String rep = interaction.read().toLowerCase().substring(0, 1);

		if (rep.equals("c")) {
			interaction.display("Solde actuel du compte selectionne :" + clientDebite.compteCourant.solde);
			double soldeTest = clientDebite.compteCourant.solde - montant;
			if (soldeTest < Constantes.LIMITE_DECOUVERT) {
				interaction.display(
						"Erreur ! Le compte debite depassera le decouvert autorise ! Annulation de l'operation, retour au menu principal.");
				return;
			}
			clientDebite.compteCourant.solde -= montant;
		} else {
			double soldeTest2 = clientDebite.compteEpargne.solde - montant;
			if (soldeTest2 < 0) {
				interaction.display(
						"Erreur ! Le compte debite depassera le decouvert autorise ! Annulation de l'operation, retour au menu principal.");
				return;
			}
			clientDebite.compteEpargne.solde -= montant;
		}

		interaction.display(
				"Pour le client a CREDITER, taper 'C' pour prendre depuis le compte courant et 'E' pour le compte epargne :");
		String rep2 = interaction.read().toLowerCase().substring(0, 1);
		if (rep2.equals("c")) {
			clientCredite.compteCourant.solde += montant;
		} else {
			clientCredite.compteEpargne.solde += montant;
		}

	}

	public void faireSimulation(Client client) {

		interaction.display("Souhaitez vous simuler un credit conso (taper c) ou un credit immobilier (taper i) ? ");
		String rep = interaction.read().toLowerCase().substring(0, 1);
		Credit credit = null;
		if (rep.equals("c")) {
			credit = new CreditConso();
		} else if (rep.equals("e")) {
			credit = new CreditImmo();
		}

		double ratio = credit.montantDu / (client.compteCourant.solde + client.compteEpargne.solde);

		interaction.display("Montant a rembourser par le client : " + credit.montantDu + ". Solde total du client : "
				+ (client.compteCourant.solde + client.compteEpargne.solde));
		if (ratio >= 1) {
			interaction.display(
					"Attention, le montant à rembourser par le client est egal ou superieur a son solde total.\n");
		}
		
		interaction.display("Souhaitez-vous accorder un credit a ce client (Oui/Non) ?");
		String choix = interaction.read().toLowerCase().substring(0,1);
		if (choix.equals("o")) {
			client.avecCredit = true;
			interaction.display("Le client est maintenant enregistre comme ayant un credit.");
		}

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

				// Affichage du resume d'un client.
				case "1":
					int index = this.listerClients();
					if (index == -1) {
						break;
					}
					Client clientSouhaite = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.get(index);
					this.afficherClient(clientSouhaite);
					break;

				// Modification d'un attribut du client selectionne.
				case "2":
					int index2 = this.listerClients();
					Client clientAModifier = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis
							.get(index2);
					this.modifierClient(clientAModifier);
					break;

				// Suppression d'un client. Retour au menu principal si absence de clients dans
				// la liste.
				case "3":
					if (this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.size() == 0) {
						interaction.display("Erreur. Votre liste ne contient aucun client. Retour au menu principal.");
						break;
					}
					this.suppressionClient();

					break;

				// Virement entre deux comptes. Le virement peut concerner le meme client.
				case "4":
					interaction.display("Indiquez le client a debiter : \n");
					int indexClientDebite = this.listerClients();
					Client clientDebite = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis
							.get(indexClientDebite);

					interaction.display("Indiquez le client a crediter : \n");
					int indexClientCredite = this.listerClients();
					Client clientCredite = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis
							.get(indexClientCredite);

					this.faireVirement(clientCredite, clientDebite);
					break;

				case "5":
					int index5 = this.listerClients();
					if (index5 == -1) {
						interaction.display("Simulation impossible. Veuillez d'abord enregistrer un client.");
						return;
					}
					Client clientSimu = this.entreprise.agences.get(0).conseillers.get(2).clientsSuivis.get(index5);
					this.faireSimulation(clientSimu);
					break;

				case "6":
					break;
					
				case "7":
					interaction.display("Fin du programme. Au revoir.");
					System.exit(0);
					break;
				}
				break;

			case "3":
				this.running = false;
				interaction.display("Fin du programme. Au revoir.");
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
