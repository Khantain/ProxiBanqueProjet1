package fr.formation.proxi1.metier;

import java.time.LocalDate;

public class CompteCourant extends CompteBancaire {

	public CompteCourant(String i, int j, LocalDate now) {
		super(i, j, now);
	}

	public CompteCourant() {
		super();
	}

}
