package com.proxibanque.presentation.model;

/**
 * @author Adminl
 **TypeDeCarte est une enumération qui va permetre de fixer des valeurs dans une classe.
 *Dans ce cas, l'énumération permet fixer les valeurs de la carte assignée au compte courant lors de sa création
 *
 */
public enum TypeDeCarte {
	
	FirstValeur ("Visa Premier"),
	SecondValeur ("Visa Electron");
	
	public String typeReel = "";

	TypeDeCarte(String type) { //constructeur toujours private pour la preservation
		this.typeReel = type;
	}

	@Override
	public String toString() {
		return typeReel;
	}
	
	

}
