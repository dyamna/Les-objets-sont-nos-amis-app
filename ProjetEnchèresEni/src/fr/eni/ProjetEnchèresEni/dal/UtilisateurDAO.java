package fr.eni.ProjetEnchèresEni.dal;

import fr.eni.ProjetEnchèresEni.bo.Utilisateur;

public interface UtilisateurDAO {
    
	/**
	 * En cas d'erreur, le code d'erreur est enregistré dans l'objet BusinessException
	 * @param u
	 * @throws BusinessExcveption
	 */
	
	
        void insert(Utilisateur u) throws BusinessExcveption;
        fr.eni.ProjetEnchèresEni.bo.Utilisateur findById(int id) throws BusinessExcveption ;
        boolean findByPseudo(Utilisateur u) throws BusinessExcveption;
        boolean findByEmail(Utilisateur u) throws BusinessExcveption;
        void update(Utilisateur u) throws BusinessExcveption;
        void delete(Utilisateur u) throws BusinessExcveption;
        boolean Select_all (Utilisateur u) throws BusinessExcveption;
        Utilisateur getUtilisateur(String uNo, String password) throws BusinessExcveption;
	
      
    
}