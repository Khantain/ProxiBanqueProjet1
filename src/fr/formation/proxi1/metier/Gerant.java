package fr.formation.proxi1.metier;


public class Gerant {
	
	public String id;

	public Gerant(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return ("Gerant "+ this.id);
	}


}
