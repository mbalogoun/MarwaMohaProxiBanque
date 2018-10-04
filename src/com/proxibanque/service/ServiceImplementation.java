package com.proxibanque.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.proxibanque.presentation.model.Client;
import com.proxibanque.presentation.model.CompteBancaire;
import com.proxibanque.presentation.model.Conseiller;
import com.proxibanque.presentation.model.TypeDeClient;

import persistance.MemoryClientDAO;
import persistance.MemoryConseillerDAO;

/**
 * @author Adminl
 *CETTE CLASSE GERE L INSTANCIATION  DE ServiceImplementation qui est le coeur de metier 
 */
/**
 * @author Adminl
 *Elle impemente les 2 interfaces ClientService, ConseillerService.
 */
public class ServiceImplementation implements ClientService, ConseillerService {

	private MemoryClientDAO daoClient = new MemoryClientDAO();
	private MemoryConseillerDAO daoConseiller = new MemoryConseillerDAO();

	@Override
	public void addClient(Client c) {
		if (c != null)
			daoClient.save(c);

	}

	@Override
	public Client findClientById(Integer id) {
		return daoClient.findById(id);
	}

	@Override
	public List<Client> getAllClient() {
		return daoClient.getAll();
	}

	@Override
	public void addConseiller(Conseiller c) {
		if (c != null)
			daoConseiller.save(c);

	}

	@Override
	public Conseiller findConseillerById(Integer id) {
		return daoConseiller.findById(id);
	}

	@Override
	public List<Client> getCustomersConseiller(Integer id) {
		return findConseillerById(id).getListClient();
	}

	@Override
	public List<Conseiller> getAllConseiller() {
		return daoConseiller.getAll();

	}

	@Override
	public void ajouterClient(Client c, Conseiller cons) {
		if (c != null && cons.getListClient().size() < Conseiller.getNbrMax() && cons.getListClient().add(c)) {
			c.setIdConseillerPerso(cons.getIdConseiller());
		} else
			System.out.println("ERREUR : Le nombre de Clients maximum par conseiller est atteint");
	}

	@Override
	public void addCompte(CompteBancaire cmptBancaire, Client c) {
		if (cmptBancaire != null && c != null) {
			if (c.getComptesClient().size() == 0) {
				if (c.getComptesClient().add(cmptBancaire))
					cmptBancaire.setIdClientProprietaire(c.getIdClient());
			} else if (c.getComptesClient().size() == 1
					&& c.getComptesClient().get(0).getTypeCompte() != cmptBancaire.getTypeCompte()) {
				if (c.getComptesClient().add(cmptBancaire))
					cmptBancaire.setIdClientProprietaire(c.getIdClient());
			} else
				System.out.println(
						"ERREUR : Il faut au maximum 1 seul compte epargne et 1 seul compte courant par client");
		} else
			System.out.println("ERREUR : au moins un des objets en parmetre est null");
	}

	@Override
	public void faireVirement(CompteBancaire cmptBancaire1, CompteBancaire cmptBancaire2, double montant) {
		if (cmptBancaire1.getSolde() >= montant) {
			cmptBancaire2.setSolde(cmptBancaire2.getSolde() + montant);
			cmptBancaire1.setSolde(cmptBancaire1.getSolde() - montant);
			System.out.println("NOTIF : La somme de " + montant + " a bien été virée");

		} else
			System.out.println("ERREUR : SOLDE INSUFFISANT");

	}

	@Override
	public List<Client> faireAudit(Map<Integer, Client> mapClient) {

		Collection<Client> listDB = new ArrayList<>();
		List<Client> listComptesRouge = new ArrayList<>();

		listDB = mapClient.values();
		if (listDB != null) {
			for (Client client : listDB) {
				int size = client.getComptesClient().size();
				if (size > 0) {
					int i;
					for(i=0; i<size; i++) {
						if (client.getTypeClient().equals(TypeDeClient.FirstValeur.toString())) {

							if (client.getComptesClient().get(i).getSolde() < -5000.0) {
								System.out.println("ATTENTION : Situation du compte critique");
								listComptesRouge.add(client);
							}

						}
						if (client.getTypeClient().equals(TypeDeClient.SecondValeur.toString())) {

							if (client.getComptesClient().get(i).getSolde() < -50000.0) {
								System.out.println("ATTENTION : Situation du compte critique");
								listComptesRouge.add(client);
							}

						}
					}
				}

			}
			
		}
		return listComptesRouge;
	}

}

