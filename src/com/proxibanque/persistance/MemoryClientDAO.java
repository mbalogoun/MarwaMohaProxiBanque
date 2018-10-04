package com.proxibanque.persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.proxibanque.presentation.model.Client;

public class MemoryClientDAO implements DAO<Client> {

	private static final Map<Integer, Client> DB = new HashMap<>();
	

	/* (non-Javadoc)
	 * @see persistance.DAO#save(java.lang.Object)
	 * Sauvegarde du client en memoire dans la hashMap, 
	 * et tant que l'ajout ne reussi pas(key existant deja),
	 */
	/*
	 * (non-Javadoc)
	 * @see persistance.DAO#save(java.lang.Object)
	 * on set le idClient avec une nouvelle valeur aleatoire.
	 */
	@Override
	public void save(Client t) {
		while(DB.put(t.getIdClient(), t) == null) {
			t.setIdClient(10000 + (int)(Math.random() * 10000));
		}
	}

	@Override
	public Client findById(Integer id) {
		return DB.get(id);
	}

	@Override
	public void deleteById(Integer id) {
		DB.remove(id);
		

	}

	@Override
	public List<Client> getAll() {
		return new ArrayList<>(DB.values());
	}

	public static Map<Integer, Client> getDb() {
		return DB;
	}

	
	
}

