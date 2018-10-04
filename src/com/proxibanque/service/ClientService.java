package com.proxibanque.service;

import java.util.List;

import com.proxibanque.presentation.model.Client;;

//import model.Client;

/**
* @author Adminl
* CETTE interface est destinee aux operations concernant les CLIENTS 
*
*/
public interface ClientService {
	
	void addClient(Client c);
	Client findClientById(Integer id);
	List<Client> getAllClient();

}
