package com.proxibanque.presentation.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adminl
 *CLASSE QUI SERT A INSTANCIER LE CONSEILLER
 *On utilise une liste afin de pouvoir retrouver les clients associés à ce conseiller
 *Un attribut Static int afin de pouvoir limiter le nombre Maximum de clients par conseiller
 */
public class Conseiller {

	private String nom;
	private String prenom;
	private Integer idConseiller;
	
	private List<Client> listClient = new ArrayList<>();
	private static int NbrMax = 10;
	
	
	
	
	public Conseiller(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		//this.idConseiller = 2000;
		//this.setIdConseiller(2000);
		setIdConseiller(1000 + (int)(Math.random() * 1000)); //alea entre 1000 et 2000
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Integer idConseiller) {
		this.idConseiller = idConseiller;
	}

	public List<Client> getListClient() {
		return listClient;
	}

	public void setListClient(List<Client> listClient) {
		this.listClient = listClient;
	}

	public static int getNbrMax() {
		return NbrMax;
	}

	@Override
	public String toString() {
		return "Conseiller [nom=" + nom + ", prenom=" + prenom + ", idConseiller=" + idConseiller + "]";
	}
	
	
	
	
	
}

