package fr.formation.proxi1.metier;

import fr.formation.proxi1.Applicative.Gestion;
import fr.formation.proxi1.IHM.Interaction;

public class Client {

	// attributs de la classe
	public String nom;
	public String prenom;
	public String adresse;
	public int codePostal;
	public String ville;
	public long telephone;
	public CompteCourant compteCourant;
	public CompteEpargne compteEpargne;
	public CarteBancaire carteBancaire;

	public Client() {
		Interaction interaction = new Interaction();
		System.out.println("");
		interaction.display("----------Creation d'un nouveau client----------\n");
		interaction.display("Saisir nom client");
		this.nom = interaction.read();
		interaction.display("Saisir prenom client");
		this.prenom = interaction.read();
		interaction.display("Saisir adresse client");
		this.adresse = interaction.read();
		interaction.display("Saisir code postal client");
		this.codePostal = 0;
		while (this.codePostal <= 0) {
		try {
			if (this.codePostal < 0) {
				interaction.display("Chiffre positif demandé");
			}
			this.codePostal = Integer.parseInt(interaction.read());
		  } catch (NumberFormatException e) {
			  interaction.display("Chiffre attendu !");
		  }
		}
		interaction.display("Saisir ville client");
		this.ville = interaction.read();
		
		interaction.display("Saisir telephone client");
		this.telephone = 0;
		while (this.telephone <= 0) {
		try {
			if (this.telephone < 0) {
				interaction.display("Chiffre positif demandé");
			}
			this.telephone = Long.parseLong(interaction.read());
		  } catch (NumberFormatException e) {
			  interaction.display("Chiffre attendu !");
		  }
		}
		this.compteCourant = new CompteCourant();
		this.compteEpargne = new CompteEpargne();
		interaction.display("Quelle carte bleu attribue au client ?");
		interaction.display("\t" + "1 - Carte visa Electron");
		interaction.display("\t" + "2 - Carte visa premier");		
		String userInput = interaction.read();
		if (userInput.equals("1")) {
			this.carteBancaire = new CarteVisa();
		}
		else if (userInput.equals("2")) {
			this.carteBancaire = new CarteVisaPremier();
		}
		System.out.println("");
		interaction.display("Saisie validee ! Donnees du nouveau client :\n");
		System.out.println("\t" + "Nom : " + this.nom + "\n");
		System.out.println("\t" + "Prenom : " + this.prenom + "\n");
		System.out.println("\t" + "Adresse : " + this.adresse + "\n");
		System.out.println("\t" + "Code Postal : " + this.codePostal + "\n");
		System.out.println("\t" + "Ville : " + this.ville + "\n");
		System.out.println("\t" + "Telephone : " + this.telephone + "\n");
		System.out.println("\t" + "Compte courant : " + this.compteCourant + "\n");
		System.out.println("\t" + "Compte épargne : " + this.compteEpargne + "\n");
		System.out.println("\t" + "Carte Visa : " + this.carteBancaire + "\n");
	}
	
	public Client(String nom, String prenom, String adresse, int codePostal, String ville, long telephone,
			CompteCourant compteCourant, CompteEpargne compteEpargne, CarteBancaire carteBancaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.telephone = telephone;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
		this.carteBancaire = carteBancaire;
	}

	@Override
	public String toString() {
		return ("Client " + this.nom + " " + this.prenom + " au solde de "
				+ (this.compteCourant.solde + this.compteEpargne.solde) + " euros. Carte Bancaire : "
				+ this.carteBancaire);
	}
}
