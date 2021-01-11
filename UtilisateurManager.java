package fr.eni.ProjetEnchèresEni.bll;

import fr.eni.ProjetEnchèresEni.bo.Utilisateur;
import fr.eni.ProjetEnchèresEni.dal.DAOFactory;
import fr.eni.ProjetEnchèresEni.dal.UtilisateurDAO;
import fr.eni.PoolConnexion.BusinessException;
import fr.eni.ProjetEnchèresEni.bll.CodesResultatBLL;

public class UtilisateurManager {

	private UtilisateurDAO UtilisateurDAO;

	/**
	 * Le constructeur permet d'initialiser la variable membre UtilisateurDAO pour
	 * permettre une communication avec la base de données.
	 */
	public UtilisateurManager() {
		this.UtilisateurDAO = DAOFactory.getUtilisateurDAO();
	}

	public Utilisateur insert(String pseudo, String nom, String prenom, String email, String telephone, String rue,
			int codePostal, String ville, String motDePasse) throws BusinessException {
		BusinessException exception = new BusinessException();

		Utilisateur utilisateur = new Utilisateur(pseudo, nom, prenom, email, telephone, rue, codePostal, ville,
				motDePasse);

		this.validerPseudo(utilisateur, exception);
		this.validerNom(utilisateur, exception);
		this.validerPrenom(utilisateur, exception);
		this.validerEmail(utilisateur, exception);
		this.validerTelephone(utilisateur, exception);
		this.validerRue(utilisateur, exception);
		this.validerCodePostal(utilisateur, exception);
		this.validerVille(utilisateur, exception);
		this.validerMotDePasse(utilisateur, exception);

		if (!exception.hasErreurs()) {
			this.UtilisateurDAO.insert(utilisateur);
		}

		if (exception.hasErreurs()) {
			throw exception;
		}
		return utilisateur;
	}

	private void valider(Utilisateur utilisateur, BusinessException businessException) {
		if (utilisateur.getPseudo() == null || utilisateur.getPseudo().equals("")
				|| utilisateur.getPseudo().length() > 150) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_PSEUDO_ERREUR);
		}
	}

	private void validerPseudo(Utilisateur utilisateur, BusinessException businessException) {
		if (utilisateur.getPseudo() == null || utilisateur.getPseudo().equals("")
				|| utilisateur.getPseudo().length() > 150) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_PSEUDO_ERREUR);
		}
	}

	private void validerEmail(Utilisateur utilisateur, BusinessException businessException) {
		if (utilisateur.getEmail() == null || utilisateur.getEmail().equals("")
				|| utilisateur.getEmail().length() > 150) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_EMAIL_ERREUR);
		}
	}

	private void validerNom(Utilisateur utilisateur, BusinessException businessException) {
		if (utilisateur.getNom() == null || utilisateur.getNom().equals("") || utilisateur.getNom().length() > 150) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_NOM_ERREUR);
		}
	}

	private void validerPrenom(Utilisateur utilisateur, BusinessException businessException) {
		if (utilisateur.getPrenom() == null || utilisateur.getPrenom().equals("")
				|| utilisateur.getPrenom().length() > 150) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_PRENOM_ERREUR);
		}
	}

	private void validerTelephone(Utilisateur utilisateur, BusinessException businessException) {
		if (utilisateur.getTelephone() == null || utilisateur.getTelephone().equals("")
				|| utilisateur.getTelephone().length() > 12) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_TELEPHONE_ERREUR);
		}
	}

	private void validerRue(Utilisateur utilisateur, BusinessException businessException) {
		if (utilisateur.getRue() == null || utilisateur.getRue().equals("") || utilisateur.getRue().length() > 150) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_RUE_ERREUR);
		}
	}

	private void validerCodePostal(Utilisateur utilisateur, BusinessException businessException) {
		if (String.valueOf(utilisateur.getCodePostal()).length() != 5) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_CDEPOSTAL_ERREUR);
		}
	}

	private void validerVille(Utilisateur utilisateur, BusinessException businessException) {
		if (utilisateur.getVille() == null || utilisateur.getVille().equals("")
				|| utilisateur.getVille().length() > 150) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_VILLE_ERREUR);
		}
	}

	private void validerMotDePasse(Utilisateur utilisateur, BusinessException businessException) {
		if (utilisateur.getMotDePasse() == null || utilisateur.getMotDePasse().equals("")
				|| utilisateur.getMotDePasse().length() > 150) {
			businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEUR_MDP_ERREUR);
		}
	}
}
