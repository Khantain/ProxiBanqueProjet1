package fr.formation.proxi1.Applicative;

<<<<<<< HEAD
import java.util.ArrayList;
=======
import java.util.HashMap;
import java.util.Map;
>>>>>>> 5d2158eaf6fca612d4f46a3e75d132d10c1593db

import fr.formation.proxi1.Bank.ProxiBanqueSI;
import fr.formation.proxi1.IHM.Interaction;
import fr.formation.proxi1.metier.Agence;
import fr.formation.proxi1.metier.Client;
import fr.formation.proxi1.metier.Conseiller;
import fr.formation.proxi1.metier.Gerant;

public class Gestion {

	public Client creerClient() {
		Client client = new Client();
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

		for (Client client2 : conseiller.clients) {
			gestion.lireInfosClient(client2);
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
	
	// zone de test 
	public void start() {
		Interaction interaction = new Interaction();
		interaction.mainMenu();
//	scanner.close();
	}

	public void creerJeudeTest() {
<<<<<<< HEAD
//		ProxiBanqueSI test = new ProxiBanqueSI();
//		this.data.agence = new ArrayList<>();
//		Agence agence = new Agence("01234", "12/10/1995");
//		agence.gerant = new Gerant("dd");
//		agence.conseillers = new ArrayList<>();
//		Gerant gerant = new Gerant("conseiller1");
//		agence.conseillers.add(new Client("p","n"));
//		this.data.agence.add(agence);
//		agence.gerant.add(gerant);
=======
		ProxiBanqueSI proxiTest = new ProxiBanqueSI("test");
System.out.println(proxiTest);
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
>>>>>>> 5d2158eaf6fca612d4f46a3e75d132d10c1593db
	}

}
