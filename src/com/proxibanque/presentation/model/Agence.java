package com.proxibanque.presentation.model;

import java.time.LocalDate;

/**
 * @author Adminl
 * CETTE CLASSE GERE L INSTANCIATION D UNE AGENCE,
 * On a utilise java.time.LocalDate pour la date
 *
 */
public class Agence {

	int idAgence;
	private LocalDate date;

	public Agence() {
		setIdAgence(40000 + (int) (Math.random() * 10000));
		setDate(date);
	}

	public int getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", date=" + date + "]";
	}

}