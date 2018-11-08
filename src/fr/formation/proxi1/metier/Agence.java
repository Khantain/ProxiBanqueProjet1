package fr.formation.proxi1.metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agence {

	public String id;
	public Gerant gerant;
	public List<Conseiller> conseillers;
	public LocalDate dateOuverture;

	public Agence(String string) {
		this.id = "agenceTest";
		this.gerant = new Gerant("JeSuisUnGerantTest");
		this.conseillers = new ArrayList<>();
		Conseiller conseiller1 = new Conseiller("JeSuisConseillerTest1");
		Conseiller conseiller2 = new Conseiller("JeSuisConseillerTest2");
		System.out.println(conseiller1);
		System.out.println(conseiller2);
		this.conseillers.add(conseiller1);
		this.conseillers.add(conseiller2);
		this.dateOuverture = LocalDate.now();
	}

}
