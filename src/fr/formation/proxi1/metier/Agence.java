package fr.formation.proxi1.metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agence {

	public String id;
	public Gerant gerant;
	public List<Conseiller> conseillers;
	public LocalDate dateOuverture;

	public Agence(String id) {
		this.id = id;
		this.gerant = new Gerant("JeSuisUnGerantTest");
		this.conseillers = new ArrayList<>();
		Conseiller conseiller1 = new Conseiller("JeSuisConseillerTest1");
		Conseiller conseiller2 = new Conseiller("JeSuisConseillerTest2");
		this.conseillers.add(conseiller1);
		this.conseillers.add(conseiller2);
		this.dateOuverture = LocalDate.now();
	}

	@Override
	public String toString() {
		return ("Agence " + this.id + " geree par " + this.gerant + ". Nombre de conseiller(s) : "
				+ this.conseillers.size());
	}

}
