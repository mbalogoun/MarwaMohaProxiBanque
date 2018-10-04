package com.proxibanque.persistance;

////import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import com.proxibanque.presentation.model.Conseiller;

//public class MemoryConseillerDAO extends AbstractDAOJdbc implements DAO<Conseiller>{
public class MemoryConseillerDAO {
}

//	private static final Map<Integer, Conseiller> DB = new HashMap<>();
//	//private int idConseiller = 0;
//	
//	/* (non-Javadoc)
//	 * @see persistance.DAO#save(java.lang.Object)
//	 * Sauvegarde du conseiller en memoire dans la hashMap, 
//	 * et tant que l'ajout ne reussi pas(key existant deja),
//	 */
//	/*
//	 * (non-Javadoc)
//	 * @see persistance.DAO#save(java.lang.Object)
//	 * on set le idConseiller avec une nouvelle valeur aleatoire.
//	 */
//	@Override
//	public int save(Conseiller t) {
//		while(DB.put(t.getIdConseiller(), t) == null){
//			t.setIdConseiller(1000 + (int)(Math.random() * 1000));
//		}
//		return 0;	
//	}
//
//	@Override
//	public Conseiller findById(Integer id) {
//		return DB.get(id);
//	}
//
//	@Override
//	public void deleteById(Integer id) {
//		DB.remove(id);
//		
//		
//	}
//
//	@Override
//	public List<Conseiller> getAll() {
//		
//		return new ArrayList<>(DB.values());
//	}
//
//
//	


