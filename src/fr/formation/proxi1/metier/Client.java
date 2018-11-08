package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

public class Client {
	
	//attributs de la classe
	public String nom;
	public String prenom;
	public String adresse;
	public int codePostal;
	public String ville;
	public int telephone;
	public CompteCourant compteCourant;
	public CompteEpargne compteEpargne;
	public CarteBancaire carteBancaire;
	
	public Client() {
		Interaction interaction = new Interaction();
		interaction.display("Saisir nom client");
		this.nom = interaction.read();
		interaction.display("Saisir prenom client");
		this.prenom = interaction.read();
		interaction.display("Saisir adresse client");
		this.adresse = interaction.read();
		interaction.display("Saisir codePostal client");
		this.codePostal = Integer.parseInt(interaction.read());
		interaction.display("Saisir ville client");
		this.ville = interaction.read();
		interaction.display("Saisir telephone client");
		this.telephone = Integer.parseInt(interaction.read());		
		this.compteCourant = new CompteCourant();
		this.compteEpargne = new CompteEpargne();
		this.carteBancaire = new CarteBancaire();
	}

	
	
}
