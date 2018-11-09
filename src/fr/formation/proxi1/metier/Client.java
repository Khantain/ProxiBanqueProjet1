package fr.formation.proxi1.metier;

import fr.formation.proxi1.Applicative.Gestion;
import fr.formation.proxi1.IHM.Interaction;

public class Client {

	// attributs de la classe
	public String nom;
	public String prenom;
	public String adresse;
	public String codePostal;
	public String ville;
	public String telephone;
	public CompteCourant compteCourant;
	public CompteEpargne compteEpargne;
	public CarteBancaire carteBancaire;

	public Client() {
		Interaction interaction = new Interaction();
		System.out.println("");
		interaction.display("----------Creation d'un nouveau client----------");
		interaction.display("Saisir nom client");
		this.nom = interaction.read();
		interaction.display("Saisir prenom client");
		this.prenom = interaction.read();
		interaction.display("Saisir adresse client");
		this.adresse = interaction.read();
		interaction.display("Saisir code postal client");
		this.codePostal = interaction.read();
		interaction.display("Saisir ville client");
		this.ville = interaction.read();
		interaction.display("Saisir telephone client");
		this.telephone = interaction.read();
		this.compteCourant = new CompteCourant();
		this.compteEpargne = new CompteEpargne();
		interaction.display("Quelle carte bleu attribue au client ?");
		interaction.display("\t" + "1 - Carte  visa Electron");
		interaction.display("\t" + "2 - Carte visa premier");		
		String userInput = interaction.read();
		if (userInput.equals("1")) {
			this.carteBancaire = new CarteVisa();
		}
		else if (userInput.equals("2")) {
			this.carteBancaire = new CarteVisaPremier();
		}
		this.carteBancaire = new CarteBancaire();
		System.out.println("");
		interaction.display("Saisie validee ! Donnees du nouveau client :");
		System.out.println("\t" + "Nom : " + this.nom);
		System.out.println("\t" + "Prenom : " + this.prenom);
		System.out.println("\t" + "Adresse : " + this.adresse);
		System.out.println("\t" + "Code Postal : " + this.codePostal);
		System.out.println("\t" + "Ville : " + this.ville);
		System.out.println("\t" + "Telephone : " + this.telephone + "\n");
		System.out.println("\t" + "Nombre compte courant : " + this.compteCourant + "\n");
		System.out.println("\t" + "Nombre compte épargne : " + this.telephone + "\n");
		System.out.println("\t" + "Nombre carte Visa electron : " + this.telephone + "\n");
		System.out.println("\t" + "Nombre carte Visa premier : " + this.telephone + "\n");
		System.out.println("\t" + "telephone : " + this.telephone + "\n");
	}

	public Client(String nom, String prenom, String adresse, String codePostal, String ville, String telephone,
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
