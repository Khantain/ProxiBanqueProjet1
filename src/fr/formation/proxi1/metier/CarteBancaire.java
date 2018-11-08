package fr.formation.proxi1.metier;

import java.time.LocalDate;

public class CarteBancaire {
	
	public String id;
	public String status;
	
	
	public CarteBancaire(String id, String status) {
		this.id = id;
		this.status = status;
	}


	public CarteBancaire() {
		this.id = "";
		this.status = "";
	}
}
