package com.proxibanque.service;

import java.util.List;
import java.util.Map;

import com.proxibanque.presentation.model.Client;
import com.proxibanque.presentation.model.CompteBancaire;
import com.proxibanque.presentation.model.Conseiller;

/**
 * @author Adminl
 *CETTE interface est destinee aux operations concernant les CONSEILLERS 
 */
public interface ConseillerService {

	
	// ACTIONS SUR CLIENTS
	
	void addConseiller(Conseiller c);
	Conseiller findConseillerById(Integer id);
	List<Client> getCustomersConseiller(Integer id);
	List<Conseiller> getAllConseiller();

	void ajouterClient(Client c, Conseiller cons);
	
	// ACTIONS SUR COMPTES
	
	void addCompte(CompteBancaire cmptBancaire, Client c);
	
	void faireVirement(CompteBancaire cmptBancaire1, CompteBancaire cmptBancaire2, double montant);
	
	List<Client> faireAudit(Map<Integer, Client> mapClient);
	
}
