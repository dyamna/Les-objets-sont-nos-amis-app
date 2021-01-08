package fr.eni.ProjetEnchèresEni.dal;


import java.util.List;
 

import fr.eni.ProjetEnchèresEni.bo.Utilisateur;

 

public interface UtilisateurDAO {
    

 

        void insert(Utilisateur u);
       fr.eni.ProjetEnchèresEni.bo.Utilisateur findById(int id) ;
        boolean findByPseudo(Utilisateur u) ;
        boolean findByEmail(Utilisateur u) ;
        void update(Utilisateur u) ;
        void delete(Utilisateur u);
        boolean Select_all (Utilisateur u) ;
       Utilisateur getUtilisateur(String uNo, String password);
	
        
    
}