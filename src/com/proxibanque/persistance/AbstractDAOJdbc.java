package com.proxibanque.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractDAOJdbc {
	String url = "jdbc:mysql://localhost:3306/tableclient";
	String username = "root";
	String password = "";
	protected void close(Connection cn, PreparedStatement st, ResultSet rs) {
		try {
			if (rs != null) rs.close();
		} catch (SQLException e) {}			
		try {
			if (st != null) st.close();
		} catch (SQLException e) {}			
		try {
			if (cn != null) cn.close();
		} catch (SQLException e) {}
	}


	public Connection getConnectionDM() throws ClassNotFoundException, SQLException {
		Connection cn;
		// Etablissement de la connexion
		Class.forName("com.mysql.jdbc.Driver");
		cn = DriverManager.getConnection(url, username, password);
		cn.setAutoCommit(false);
		return cn;
	}
}
