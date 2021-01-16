package fr.eni.ProjetEnchèresEni.bll;

public abstract class CodesResultatBLL {

	/**
	 * Echec quand le pseudo de utilisateur ne repsecte pas les règles définies
	 */
	public static final int REGLE_UTILISATEUR_PSEUDO_ERREUR = 20000;
	/**
	 * Echec quand l'email de Utilisateur ne repsecte pas les règles définies
	 */
	public static final int REGLE_UTILISATEUR_EMAIL_ERREUR = 20001;

	/**
	 * Echec quand le nom de Utilisateur ne repsecte pas les règles définies
	 */
	public static final int REGLE_UTILISATEUR_NOM_ERREUR = 20002;
	/**
	 * Echec quand le prénom de Utilisateur ne repsecte pas les règles définies
	 */
	public static final int REGLE_UTILISATEUR_PRENOM_ERREUR = 20003;
	/**
	 * Echec quand le téléphone de Utilisateur ne repsecte pas les règles définies
	 */
	public static final int REGLE_UTILISATEUR_TELEPHONE_ERREUR = 20004;
	/**
	 * Echec quand la rue de Utilisateur ne repsecte pas les règles définies
	 */
	public static final int REGLE_UTILISATEUR_RUE_ERREUR = 20005;
	/**
	 * Echec quand la ville de Utilisateur ne repsecte pas les règles définies
	 */
	public static final int REGLE_UTILISATEUR_VILLE_ERREUR = 20006;
	/**
	 * Echec quand le nom de Utilisateur ne repsecte pas les règles définies
	 */
	public static final int REGLE_UTILISATEUR_CDEPOSTAL_ERREUR = 20007;
	/**
	 * Echec quand le MDP de Utilisateur ne repsecte pas les règles définies
	 */
	public static final int REGLE_UTILISATEUR_MDP_ERREUR = 20008;
	/**
	 * Echec mail déjà existant en BDD
	 */
	public static final int REGLE_UTISATEUR_MAIL_DEJA_EXISTANT = 20009;
	/**
	 * Echec pseudo déjà existant en BDD
	 */
	public static final int REGLE_UTISATEUR_PSEUDO_DEJA_EXISTANT = 20010;
		
	}

