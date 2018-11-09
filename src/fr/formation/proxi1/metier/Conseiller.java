package fr.formation.proxi1.metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.formation.proxi1.Presentation.Interaction;

/**
 * Classe representant un conseiller rattache a une agence de l'entreprise.
 * 
 * @author Adminl
 *
 */
public class Conseiller {

	public String id;
	public List<Client> clientsSuivis;
	public List<Client> clientsArchives;

	/**
	 * Constructeur de la classe conseiller permettant d'y ajouter deux clients
	 * fictifs.
	 * 
	 * @param id Le nom du conseiller
	 */
	public Conseiller(String id) {

		this.clientsSuivis = new ArrayList<>();
		Client client1 = new Client("Carre", "Triangle", "12 rue des Abysses", 32000, "Bordeaux", 1457819349,
				new CompteCourant("123", 3000, LocalDate.now()), new CompteEpargne("4551", 32145, LocalDate.now()),
				new CarteVisa("12354867", "active"));
		Client client2 = new Client("Cercle", "Alexandre", "4 avenue de Paris", 13568, "Marseille", 1234578699,
				new CompteCourant("456", 3000, LocalDate.now()), new CompteEpargne("78415", 32145, LocalDate.now()),
				new CarteVisa("7841", "active"));
		this.clientsSuivis.add(client1);
		this.clientsSuivis.add(client2);
		this.clientsArchives = new ArrayList<>();
	}

	/**
	 * Constructeur par defaut de la classe conseiller avec une liste de clients
	 * vide.
	 * 
	 */
	public Conseiller() {
		Interaction interaction = new Interaction();
		interaction.display("Bonjour. veuillez saisir votre nom : ");
		this.id = interaction.read();
		this.clientsSuivis = new ArrayList<>();
		this.clientsArchives = new ArrayList<>();
		interaction.display("Bonjour " + this.id + ". Vous n'avez pour l'instant aucun client enregistre. \n");
	}

	@Override
	public String toString() {
		return ("Conseiller " + this.id + " en charge de " + this.clientsSuivis.size() + " client(s).");
	}

}
