package com.proxibanque.presentation.model;

/**
 * @author Adminl
 *Dans la m�me optique de fixer une valeur. Nous fixons le type de client � la classe Client.
 */
public enum TypeDeClient {

	FirstValeur ("Particulier"),
	SecondValeur ("Professionel");
	
	public String typeReel = "";

	private TypeDeClient(String typeReel) {
		this.typeReel = typeReel;
	}

	@Override
	public String toString() {
		return typeReel;
	}
	
	
	
}
