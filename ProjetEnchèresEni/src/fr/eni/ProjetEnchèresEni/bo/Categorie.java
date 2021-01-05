package fr.eni.ProjetEnchèresEni.bo;

public class Categorie {

	private int noCategorie;
	private String libelle;

	// Constructeur avec tout les paramètres

	public Categorie(int noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}

	// Constructeur à vide

	public Categorie() {
		super();
	}

	// Getters & Setters

	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	// Méthode ToString

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}

}
