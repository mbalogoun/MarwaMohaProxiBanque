package com.proxibanque.persistance;

import java.util.List;

/**
 * @author Adminl
 *INTERFACE DAO : c'est l'interface qui va nous permettre de gerer les fonctions de BDD de notre systeme.
 *Grace � la G�n�ricit� nous pouvons cr�er deux espaces de sauvegarde :
 * un espace pour les Clients et un autre pour les Conseillers 
 *
 * @param <T>
 */
public interface DAO<T> {

	void save(T t);

	T findById(Integer id);

	void deleteById(Integer id);

	List<T> getAll();

}