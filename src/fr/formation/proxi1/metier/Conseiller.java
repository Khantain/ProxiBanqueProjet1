package fr.formation.proxi1.metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.formation.proxi1.IHM.Interaction;

public class Conseiller {

	public String id;
	public List<Client> clients;

	public Conseiller(String id) {
		
		
			this.id = id;
			this.clients = new ArrayList<>();
			Client client1 = new Client("Carre", "Triangle", "12 rue des Abysses",32000, "Bordeaux", 0145781934,
					new CompteCourant("123", 3000, LocalDate.now()), new CompteEpargne("4551", 32145, LocalDate.now()), new CarteVisa("12354867","active"));
			Client client2 = new Client("Cercle", "Alexandre", "4 avenue de Paris", 13568, "Marseille", 0123457869,
					new CompteCourant("456", 3000, LocalDate.now()), new CompteEpargne("78415", 32145, LocalDate.now()), new CarteVisa("7841","active"));
			this.clients.add(client1);
			this.clients.add(client2);
			
<<<<<<< HEAD
		
		}
		
		else if(id.equals("JeSuisConseillerTest2")) {
			this.id = id;
			this.clients = new ArrayList<>();
			Client client3 = new Client("Joli", "Jose", "58 rue des Roses",55140, "Bordeaux", 0145781934,
					new CompteCourant("123", 3000, LocalDate.now()), new CompteEpargne("4551", 32145, LocalDate.now()), new CarteVisa("12354867","active"));
			Client client4 = new Client("Ferc", "Bureau", "41 rue des Abysses",45128, "Plouc", 0145457812,
					new CompteCourant("123", 3000, LocalDate.now()), new CompteEpargne("4551", 32145, LocalDate.now()), new CarteVisa("12354867","active"));
			this.clients.add(client3);
			this.clients.add(client4);
		
		}
=======
	
>>>>>>> 05c348a088c2478c7100e6815692d8ded85e4740
	}
	
	public Conseiller(){
		Interaction interaction = new Interaction();
		interaction.display("Bonjour. veuillez saisir votre nom : ");
		this.id = interaction.read();
		this.clients = new ArrayList<>();
		interaction.display("Bonjour " + this.id+ ". Vous n'avez pour l'instant aucun client enregistre. \n");
	
	}

	@Override
	public String toString() {
		return ("Conseiller " + this.id+ " en charge de " + this.clients.size() + " client(s).");
	}

}
