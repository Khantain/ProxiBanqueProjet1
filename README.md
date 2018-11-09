# ProxiBanqueProjet1
Projet dans le cadre de la formation GTM

LANCEMENT :

Verifier que java est installe, s'il ne l'est pas, le telecharger a l'adresse : "https://www.java.com/fr/download/".

Dezipper le fichier contenant l'application, 

Pour lancer l'application executer le fichier exec.bat dans le dossier contenant les fichiers de l'archive (apres l'avoir dezippee).

CAS D'UTILISATION :

Des le debut, une agence de numero (id : 32AB4), deux conseillers (JeSuisConseillerTest1 et JeSuisConseillerTest2), possèdent chacun deux client test :
	
	"nom" "prenom" "adresse" "code postal" "Ville" " Tel" "compteCourant | numero | solde" "compteEpargne | numero | solde" "CarteVisa | numero | status)"
	"Carre", "Triangle", "12 rue des Abysses", 32000, "Bordeaux", 1457819349, CompteCourant("123", 3000 euros), CompteEpargne("4551", 32145 euros) CarteVisa("12354867", "active")
	"Cercle", "Alexandre", "4 avenue de Paris", 13568, "Marseille", 1234578699,	CompteCourant("456", 3000 euros), CompteEpargne("78415", 32145 euros) CarteVisa("7841", "active")
	
Ces deux conseillers et clients ne sont pas visible par l'utilisateur. Un conseiller n'a pour l'instant pas acces aux clients d'un autre conseiller.

L'application ProxiBanqueSI permet une gestion des clients.

Lors du lancement de l'application, la premiere etape consiste a rentrer son nom (celui du nouveau conseiller).

Ensuite le logiciel fait apparaitre le menu principal contenant 3 possiblités :

	1 - Creer un client
	
Cette option permet de rentrer manuellement les informations necessaires à la création d'un nouveau set d'informaton "client" contenant :

		Nom
		Prenom
		Adresse
		Code Postal
		Ville
		Telephone
		Compte courant
		Compte epargne
		Type de carte bancaire (Electron + Premier)
		Numero de carte 
	
	2 - Gerer client

Cette option ouvre le deuxieme menu de l'application permettant de faire les actions suivantes :
	
		1 - Afficher les informations d'un client
		
		Permet de choisir et afficher les informations liées à un client.
		
		2 - Modifier les informations client
		
		Permet de choisir le client, puis de modifier au choix :
		
				1 - Nom
				2 - Prenom
				3 - Adresse
				4 - Code postal
				5 - Ville
				6 - Telephone
				7 - Compte Courant
				8 - Compte Epargne
				9 - Carte Visa
				
		3 - Supprimer un client
		
		Permet de choisir et de supprimer un client.
		
		4 - Faire virement
		
		Permet de choisir un compte debiteur et un compte debite pour effectuer un virement de l'un a l'autre.
		
		5 - Faire simulation
		
		Permet de tester une simulation de credit en mettant un montant et une duree de base, l'application renvoie le montant que doit rembourser le crediteur, ainsi que la mensualité.
		Une reponse sur la possibilité du près est donnée en fonction du montant du proprietaire.
		
		6 - Retour menu principal
		
		Permet de revenir dans le menu principal contenant les 3 possiblites precedentes.
		
		7 - Quitter le programme	
	
		Comme son nom l'indique cette option permet de quitter le programme.
	
	3 - Quitter le programme

Comme son nom l'indique cette option permet de quitter le programme.

ADRESSE GITHUB

https://github.com/Khantain/ProxiBanqueProjet1
