package fr.formation.proxi1.Data;

/**
 * 
 * @author Adminl
 *
 *La classe "Constantes" permet de stocker les valeurs par default de l'application ProxiBanqueSI de limite du decouvert (fix� � 1000) et du taux reli� au compte epargne (fix� � trois).
 *Cela permet de modifier ces deux valeurs sans impacter le reste de l'application.
 *De plus la modification de ces valeurs est facile pour une personne exterieur au monde de la programation.
 *
 */


public class Constantes {
	
	public static final int LIMITE_DECOUVERT = -1000;
	public static final double TAUX_COMPTE_EPARGNE = 3;
	public static final double TAUX_RENDEMENT_CREDIT_CONSO = 3;
	public static final double TAUX_RENDEMENT_CREDIT_IMMO = 5;
	

}
