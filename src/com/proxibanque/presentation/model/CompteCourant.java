package com.proxibanque.presentation.model;

/**
 * @author Adminl
 *CETTE CLASSE GERE L INSTANCIATION  D UN COMPTE BANCAIRE COURANT,
 *ET ETEND LA CLASSE ABSTRITE CompteBancaire.
 *On a utilise private static final String pour la discriminer. 
 */
public class CompteCourant extends CompteBancaire {

	private int decouvert = 1000;
	private static final String COURANT = "COURANT";
	private String typeCarte;

	public CompteCourant(TypeDeCarte param) {
		setTypeCompte(COURANT);
		choixTypeCarte(param);
	}
	
	public void choixTypeCarte(TypeDeCarte param){
	    if(param.equals(TypeDeCarte.FirstValeur))
	    	typeCarte=TypeDeCarte.FirstValeur.toString();
	    if(param.equals(TypeDeCarte.SecondValeur))
	    	typeCarte=TypeDeCarte.SecondValeur.toString();
	  }

	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public int getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(int decouvert) {
		this.decouvert = decouvert;
	}
	
	

	@Override
	public void setTypeCompte(String COURANT) {
		
		super.setTypeCompte(COURANT);
	}
	
	

	public static String getCourant() {
		return COURANT;
	}

	@Override
	public String toString() {
		return "CompteCourant [idCompte=" + this.getIdCompte() + ", solde=" + this.getSolde() + ", date="
				+ this.getDate() + " , typeCarte=" + typeCarte + ", decouvert=" + decouvert + "]";
	}

}
