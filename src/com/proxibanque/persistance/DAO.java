package com.proxibanque.persistance;

import java.util.List;

import com.proxibanque.presentation.model.Client;



/**
 * @author Adminl
 *INTERFACE DAO : c'est l'interface qui va nous permettre de gerer les fonctions de BDD de notre systeme.
 *Grace à la Généricité nous pouvons créer deux espaces de sauvegarde :
 * un espace pour les Clients et un autre pour les Conseillers 
 *
 * @param <T>
 */
public interface DAO<T> {

	int save(T t);

	T findById(Integer id);

	int deleteById(Integer id);

	List<T> getAll();
	int update(Client c);

}