package fr.eni.ProjetEnchèresEni.bo;

import java.time.LocalDate;

public class Enchere {

	public Enchere(LocalDate dateEnchere, int montant_enchere) {
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
	}

	// Constructeur vide
	public Enchere() {
	}

	// Constructeur avec tous les paramètres
	public LocalDate dateEnchere;
	public int montant_enchere;

	public LocalDate getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public int getMontant_enchere() {
		return montant_enchere;
	}

	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	// Méthode toString
	@Override
	public String toString() {
		return "Enchere [dateEnchere=" + dateEnchere + ", montant_enchere=" + montant_enchere + "]";
	}

}
