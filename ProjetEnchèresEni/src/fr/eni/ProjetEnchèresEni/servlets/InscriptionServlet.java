package fr.eni.ProjetEnchèresEni.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.PoolConnexion.BusinessException;
import fr.eni.ProjetEnchèresEni.bll.UtilisateurManager;
import fr.eni.ProjetEnchèresEni.bo.Utilisateur;
import fr.eni.ProjetEnchèresEni.dal.UtilisateurDAO;



@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public InscriptionServlet() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	/**	'
		UtilisateurManager um = new UtilisateurManager();
		List<Utilisateur> listeUtilisateur = um.selectionnerListeUtilisateur();
		
		request.setAttribute("listeUtilisateur", listeUtilisateur);
		**/
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/inscription.jsp").forward(request, response);
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
// Récupération des données saisis 
		
	String pseudo =request.getParameter("Pseudo");
	String nom =request.getParameter("Nom");
	String prenom =request.getParameter("Prenom");
	String email =request.getParameter("Email");
	String telephone =request.getParameter("Telephone");
	String rue =request.getParameter("Rue");
	String ville =request.getParameter("Ville");
	int codePostal =35310;
	String mdp =request.getParameter("MotDePasse");
	//String confirmation =request.getParameter("Confirm");
	
	System.out.println("Pseudo");
	System.out.println("Nom");
	System.out.println("Prenom");
	System.out.println("Email");
	System.out.println("Telephone");
	System.out.println("Rue");
	System.out.println("Ville");
	System.out.println("codePostal");
	System.out.println("MDP");
	//System.out.println("Confirm");
	
	
	UtilisateurManager utililisateurManager = new UtilisateurManager();
    Utilisateur u = null;
    try {
        u = utililisateurManager.insert(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, mdp);
    }
    catch (BusinessException e) {
    
        e.printStackTrace();
    }


	this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/inscription.jsp").forward(request, response);
	}
}
	/** Condition d'utilisation d'un pseudo et e-mail unique
	
				Utilisateur unUtilisateur = null;
				boolean testPseudo, testEmail;

				testPseudo = UtilisateurDAO.verificationPseudo(request.getParameter("Pseudo"));
				testEmail = UtilisateurDAO.verificationMail(request.getParameter("Mail"));
				
			

				if (testPseudo == false) {
					request.setAttribute("erreurPseudo", "Ce pseudo est déjà utilisé, veuillez en saisir un autre.");
					this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);	
					} else if(testEmail == false) {
						request.setAttribute("erreurMail", "Ce mail est déjà utilisé, veuillez en saisir un autre.");
						this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
						} else if (testPseudo==false){
							request.setAttribute("erreurTel", "Ce numéro de téléphone est déjà utilisé, veuillez en saisir un autre.");
							this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
						}
		***/
				
	
		


