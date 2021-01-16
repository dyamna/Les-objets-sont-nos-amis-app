package fr.eni.ProjetEnchèresEni.dal;

public abstract class CodesResultatDAL {

	public static final int OBJET_NULL=10000; //L'objet est nulle
	public static final int FIND_OBJET_NOTEXIST =10001 ;
	public static final int INSERT_OBJET_ECHEC=10002;//Echec d'ajout de l'objet
	public static final int FIND_ID_NOTEXIST=10003;//L'objet ID n'existe pas
	public static final int FIND_EMAIL_NOTEXIST=10004;//L'objet Email n'existe pas 
	public static final int UPDATE_OBJET_ECHEC=10005;//Echec de la mise à jour de l'objet
	public static final int DELETE_OBJET_ECHEC=10006;//Echec de la suppression de l'objet
	public static final int DOUBLE_MAIL=10007;//Le mail existe déjà en BDD
	public static final int DOUBLE_PSEUDO=10008;//Le pseudo existe déjà en BDD
	
}
