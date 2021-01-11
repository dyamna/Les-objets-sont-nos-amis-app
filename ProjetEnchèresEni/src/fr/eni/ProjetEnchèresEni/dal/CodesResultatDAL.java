package fr.eni.ProjetEnchèresEni.dal;

public abstract class CodesResultatDAL {

	public static final int OBJET_NULL=1000; //L'objet est nulle
	public static final int FIND_OBJET_NOTEXIST =1001 ;
	public static final int INSERT_OBJET_ECHEC=1002;//Echec d'ajout de l'objet
	public static final int FIND_ID_NOTEXIST=1003;//L'objet ID n'existe pas
	public static final int FIND_EMAIL_NOTEXIST=1004;//L'objet Email n'existe pas 
	public static final int UPDATE_OBJET_ECHEC=1005;//Echec de la mise à jour de l'objet
	public static final int DELETE_OBJET_ECHEC=1006;//Echec de la suppression de l'objet
	
}
