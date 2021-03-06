package fr.formation.proxi1.metier;

import fr.formation.proxi1.Presentation.Interaction;

/**
 * Classe representant un client de la banque. Si le client est supprime, il est
 * transfere vers la liste des clients archives du conseilelr et sa carte
 * bancaire est desactivee. Il ne peut posseder que deux comptes (un compte
 * courant et un compte epargne) et une seule carte bancaire.
 * 
 * @author Adminl
 *
 */
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
	public boolean archive;
	public boolean avecCredit;

	/**
	 * Constructeur permettant de choisir tous les attributs du client.
	 * 
	 */
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

		// controle que le code postal soit un entier positif.
		this.codePostal = -1;
		while (this.codePostal <= -1) {
			try {
				if (this.codePostal < -1) {
					interaction.display("Code postal positif obligatoire !");
				}
				this.codePostal = Integer.parseInt(interaction.read());
			} catch (NumberFormatException e) {
				interaction.display("Chiffre attendu !");
			}
		}
		interaction.display("Saisir ville client");
		this.ville = interaction.read();

		// controle que le numero de telephone soit un entier positif.
		interaction.display("Saisir telephone client");
		this.telephone = -1;
		while (this.telephone <= -1) {
			try {
				if (this.telephone < -1) {
					interaction.display("Numero positif obligatoire !");
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
		String userInput = "";
		do {
			userInput = interaction.read();
			if (userInput.equals("1")) {
				this.carteBancaire = new CarteVisa();
			} else if (userInput.equals("2")) {
				this.carteBancaire = new CarteVisaPremier();
			}
		} while (!(userInput.equals("1") || userInput.equals("2")));

		this.archive = false;
		this.avecCredit = false;
	}

	/**
	 * Constructeur avec arguments. Le client ne peut avoir qu'un seul compte
	 * courant, un seul compte epargne et une seule carte Bleue (Visa Premier ou
	 * Electron.).
	 * 
	 * @param nom           Nom du client.
	 * @param prenom        Prenom du client.
	 * @param adresse       Adresse du client;
	 * @param codePostal    Code Postal du lieu de residence.
	 * @param ville         Ville de residence.
	 * @param telephone     Numero de telephone du client.
	 * @param compteCourant Compte courant du client.
	 * @param compteEpargne Compte Epargne du client.
	 * @param carteBancaire CarteBleue du client (Premier ou Electron).
	 */
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
		this.archive = false;
		this.avecCredit = false;
	}

	@Override
	public String toString() {
		return ("Client " + this.nom + " " + this.prenom + ".");
	}
}
