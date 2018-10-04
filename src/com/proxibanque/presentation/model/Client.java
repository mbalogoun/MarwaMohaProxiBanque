package com.proxibanque.presentation.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adminl
 *CETTE CLASSE GERE L INSTANCIATION D UN CLIENT?
 *L IDCLIENT EST GENERE ALEATOIREMENT
 */
public class Client {
	
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String telephone;
	private String typeClient;
	private Integer idClient;
	private Integer idConseillerPerso;
	private String emailClient;
	
	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public Client(String emailClient) {
		super();
		this.emailClient = emailClient;
	}
	private List<CompteBancaire> comptesClient = new ArrayList<>();
	private static int NbrMaxComptes = 2;
		
	
	
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom, TypeDeClient param) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		setIdClient(10000 + (int)(Math.random() * 10000)); //alea entre 10000 et 20000
		choixTypeClient(param);
		
	}
	
	public void choixTypeClient( TypeDeClient param) {
		if(param.equals(TypeDeClient.FirstValeur))
	    	typeClient=TypeDeClient.FirstValeur.toString();
	    if(param.equals(TypeDeClient.SecondValeur))
	    	typeClient=TypeDeClient.SecondValeur.toString();
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
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	
	public Integer getIdConseillerPerso() {
		return idConseillerPerso;
	}
	public void setIdConseillerPerso(Integer idConseillerPerso) {
		this.idConseillerPerso = idConseillerPerso;
	}
	
	public List<CompteBancaire> getComptesClient() {
		return comptesClient;
	}
	public void setComptesClient(List<CompteBancaire> comptesClient) {
		this.comptesClient = comptesClient;
	}
	
	public static int getNbrMaxComptes() {
		return NbrMaxComptes;
	}
	
		
	public static void setNbrMaxComptes(int nbrMaxComptes) {
		NbrMaxComptes = nbrMaxComptes;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", typeClient=" + typeClient + "]";
	}
	

}
