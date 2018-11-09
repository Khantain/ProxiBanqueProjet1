package fr.formation.proxi1.metier;

import fr.formation.proxi1.IHM.Interaction;

public class CarteBancaire {
	
	public String id;
	public String status;
	
	
	public CarteBancaire(String id, String status) {
		this.id = id;
		this.status = status;
	}


	public CarteBancaire() {
		Interaction interaction = new Interaction();
		interaction.display("Saisir numero carte Visa Electron");
		this.id = interaction.read();
		this.status = "active";
	}



	@Override
	public String toString() {
		return ("Carte numero : " + this.id + ". Statut : " + this.status + ".");
	}	

}
