package com.proxibanque.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.proxibanque.presentation.model.Client;




public class MemoryClientDAO extends AbstractDAOJdbc implements DAO<Client> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see persistance.DAO#save(java.lang.Object) Sauvegarde du client en memoire
	 * dans la hashMap, et tant que l'ajout ne reussi pas(key existant deja),
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see persistance.DAO#save(java.lang.Object) on set le idClient avec une
	 * nouvelle valeur aleatoire.
	 */
	@Override
	public int save(Client t) {
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;
		try {
			cn = getConnectionDM();

			String sql = "insert into tableclient values (?, ?, ?,?,?,?,?,?,?,?)";

			st = cn.prepareStatement(sql);
			st.setString(1, t.getNom());
			st.setString(2, t.getPrenom());
			st.setString(3, t.getAdresse());
			st.setString(4, t.getCodePostal());
			st.setInt(4, t.getIdConseillerPerso());
			st.setString(5, t.getVille());
			st.setString(6, t.getTelephone());
			st.setString(7, t.getTypeClient());
			st.setString(8, t.getEmailClient());

			result = st.executeUpdate();

			cn.commit();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

			try {
				if (cn != null)
					cn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		} finally {
			close(cn, st, null);
		}
		return result;
	}

	@Override
	public Client findById(Integer id) {
		Client cl = null;
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			cn = getConnectionDM();

			String sql = "select nom, prenom, email, adresse from tableclient where idClient = ?";

			st = cn.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();

			if (rs.next()) {
				cl = new Client();

				cl.setNom(rs.getString("nom"));
				cl.setPrenom(rs.getString("prenom"));
				cl.setAdresse(rs.getString("adresse"));
				cl.setCodePostal(rs.getString("codePostale"));
				cl.setIdConseillerPerso(rs.getInt("idConseillerPerso"));
				cl.setVille(rs.getString("ville"));
				cl.setTelephone(rs.getString("telephone"));
				cl.setTypeClient(rs.getString("typeClient"));
				cl.setEmailClient(rs.getString("email"));

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			close(cn, st, rs);
		}

		return cl;

	}

	@Override
	public int deleteById(Integer id) {
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;
		try {
			cn = getConnectionDM();

			String sql = "delete from tableclient where id = ?";

			st = cn.prepareStatement(sql);
			st.setInt(1, id);

			result = st.executeUpdate();
			cn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

			try {
				if (cn != null)
					cn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}

		} finally {
			close(cn, st, null);
		}
		return result;

	}

	@Override
	public List<Client> getAll() {
		Client cl = new Client();
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs=null;
		List<Client> liste = new ArrayList<>();
		try {
			cn = getConnectionDM();
			String sql= "Select * (idClient, nom, prenom) from tableclient";
			st=cn.prepareStatement(sql);
			rs = st.executeQuery();

			if (rs.next()) {
				
				cl.setIdClient(rs.getInt("idClient"));
				cl.setNom(rs.getString("nom"));
				cl.setPrenom(rs.getString("prenom"));
				liste.add(cl);

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			close(cn, st, rs);
		}
			
		return liste;
		

	}

	@Override
	public int update(Client c) {
		Connection cn = null;
		PreparedStatement st = null;
		int result = -1;
		try {
			cn = getConnectionDM();

			String sql = "update tableclient set nom = ?, prenom = ?, email = ? , adresse = ? where id = ?";
			st = cn.prepareStatement(sql);
			st.setString(1, c.getNom());
			st.setString(2, c.getPrenom());
			st.setString(3, c.getAdresse());
			st.setString(4, c.getEmailClient());
			st.setInt(4, c.getIdClient());
			result = st.executeUpdate();
			cn.commit();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

			try {
				if (cn != null)
					cn.rollback();
			} catch (SQLException e1) {
				e.printStackTrace();
			}
		} finally {
			close(cn, st, null);
		}
		return result;
	}



}
