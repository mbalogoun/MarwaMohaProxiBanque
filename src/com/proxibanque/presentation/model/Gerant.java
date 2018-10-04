package com.proxibanque.presentation.model;

/**
 * @author Adminl
 *CLASSE QUI INSTANCIE LE GERANT
 *Le Gerant est une extension de Conseiller, il va donc pouvoir activer les mêmes méthodes et hérite de ses attributs
 *
 */
public class Gerant extends Conseiller {

	private boolean autorisationAudit;

	public Gerant(String nom, String prenom) {
		super(nom, prenom);
		setAutorisationAudit(true);

	}

	public boolean isAutorisationAudit() {
		return autorisationAudit;
	}

	public void setAutorisationAudit(boolean autorisationAudit) {
		this.autorisationAudit = autorisationAudit;
	}

	@Override
	public String toString() {
		return "Gerant [autorisationAudit=" + autorisationAudit + ", getNom()=" + getNom() + ", getPrenom()="
				+ getPrenom() + "]";
	}

}
