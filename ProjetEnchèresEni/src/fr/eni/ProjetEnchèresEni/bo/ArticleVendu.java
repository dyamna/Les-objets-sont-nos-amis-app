	package fr.eni.ProjetEnchèresEni.bo;

	import java.time.LocalDate;

	public class ArticleVendu {


	private String nomArticle;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private int miseAPrix;
	private int prixVente;
	private boolean etatVente;

	//Constructeur avec tout les paramètres

	private int noArticle;
	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
	LocalDate dateFinEncheres, int miseAPrix, int prixVente, boolean etatVente) {
	super();
	this.noArticle = noArticle;
	this.nomArticle = nomArticle;
	this.description = description;
	this.dateDebutEncheres = dateDebutEncheres;
	this.dateFinEncheres = dateFinEncheres;
	this.miseAPrix = miseAPrix;
	this.prixVente = prixVente;
	this.etatVente = etatVente;
	}

	// Constructeur vide

	public ArticleVendu() {
	super();
	}

	//Getters & Setters

	public String getNomArticle() {
	return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
	this.nomArticle = nomArticle;
	}

	public String getDescription() {
	return description;
	}

	public void setDescription(String description) {
	this.description = description;
	}

	public LocalDate getDateDebutEncheres() {
	return dateDebutEncheres;
	}

	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
	this.dateDebutEncheres = dateDebutEncheres;
	}

	public LocalDate getDateFinEncheres() {
	return dateFinEncheres;
	}

	public void setDateFinEncheres(LocalDate dateFinEncheres) {
	this.dateFinEncheres = dateFinEncheres;
	}

	public int getMiseAPrix() {
	return miseAPrix;
	}

	public void setMiseAPrix(int miseAPrix) {
	this.miseAPrix = miseAPrix;
	}

	public int getPrixVente() {
	return prixVente;
	}

	public void setPrixVente(int prixVente) {
	this.prixVente = prixVente;
	}

	public boolean isEtatVente() {
	return etatVente;
	}

	public void setEtatVente(boolean etatVente) {
	this.etatVente = etatVente;
	}

	public int getNoArticle() {
	return noArticle;
	}

	public void setNoArticle(int noArticle) {
	this.noArticle = noArticle;
	}

	// Methode ToString

	@Override
	public String toString() {
	return "ArticleVendu [nomArticle=" + nomArticle + ", description=" + description + ", dateDebutEncheres="
	+ dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", miseAPrix=" + miseAPrix
	+ ", prixVente=" + prixVente + ", etatVente=" + etatVente + ", noArticle=" + noArticle + "]";
	}
}
