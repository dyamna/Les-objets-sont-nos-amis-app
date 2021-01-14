package fr.eni.ProjetEnchèresEni.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.PoolConnexion.BusinessException;
import fr.eni.ProjetEnchèresEni.bll.CodesResultatBLL;
import fr.eni.ProjetEnchèresEni.bll.UtilisateurManager;
import fr.eni.ProjetEnchèresEni.bo.Utilisateur;
import fr.eni.ProjetEnchèresEni.dal.UtilisateurDAO;
import fr.eni.ProjetEnchèresEni.ihm.CodesResultatihm;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		HttpSession session = request.getSession();
		
		//recuperation des variables session		

		
		
		if(session.getAttribute("isConnectewwwww")==null)
		{
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward( request,  response);
		}
		else
		{
			response.sendRedirect(request.getContextPath()+"/ServletAccueil");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Utilisateur utilisateur;
		boolean resultat;

		String identifiant = request.getParameter( "identifiant" );
		String motDePasse = request.getParameter( "motDePasse" );	
		
		HttpSession session = request.getSession();

		try
		{			
			resultat = new UtilisateurManager().validerUtilisateur(identifiant,motDePasse);
			
			if( resultat)
			{
				// Si bonne connexion, affichage nouvelle page
				session.setAttribute( "isConnecte", true ); //récupération
				session.setAttribute("identifiant", identifiant);
			//	session.setAttribute( "pseudo", utilisateur.getPseudo() );
			//	session.setAttribute( "isAdministrateur", utilisateur.isAdmnistrateur() );
				session.setAttribute( "succes", "Vous êtes connecté");				
				
				response.sendRedirect(request.getContextPath()+"/WEB-INF/accueil.jsp");				
			}
			else
			{
				// Si mauvaise connexion, affichage du formulaire
				session.setAttribute("isConnecte", false);
				session.setAttribute("identifiant", "");
				session.setAttribute("motDePasse", "");
				session.setAttribute("erreur", "Indentifiant ou Password incorrect");
				
				request.getRequestDispatcher( "/WEB-INF/jsp/login.jsp").forward( request,  response);
			}
		
		}	
		finally {
			
		}
	}
	
	
}
	

		    

