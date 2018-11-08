package fr.formation.proxi1.metier;

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
		return ("Je suis un client" + this.nom);
	}

	
	
	
}
