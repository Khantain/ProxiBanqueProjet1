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
		interaction.display("----------Crï¿½ation d'un nouveau client----------");
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
		this.carteBancaire = new CarteBancaire();
		System.out.println("");
		interaction.display("Saisie validï¿½e ! Donnï¿½s du nouveau client :");
		System.out.println("\t" + "Nom : " + this.nom);
		System.out.println("\t" + "Prenom : " + this.prenom);
		System.out.println("\t" + "Adresse : " + this.adresse);
		System.out.println("\t" + "Code Postal : " + this.codePostal);
		System.out.println("\t" + "Ville : " + this.ville);
<<<<<<< HEAD
		System.out.println("\t" + "Telephone : " + this.telephone + "\n");
		System.out.println("\t" + "Nombre compte courant : " + this.telephone + "\n");
		System.out.println("\t" + "Nombre compte épargne : " + this.telephone + "\n");
		System.out.println("\t" + "Nombre carte Visa electron : " + this.telephone + "\n");
		System.out.println("\t" + "Nombre carte Visa premier : " + this.telephone + "\n");
		interaction.mainMenu();
=======
		System.out.println("\t" + "telephone : " + this.telephone + "\n");
>>>>>>> 5557b3e96200c04ad657296e55f371c925070cc4
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
