package fr.eni.ProjetEnchèresEni.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import fr.eni.ProjetEnchèresEni.bo.Utilisateur;

public   class UtilisateurDAOImpl implements UtilisateurDAO{




private static final String INSERT="INSERT INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) VALUES(?,?,?,?,?,?,?,?,?,?,?);\";";
private static final String DELETE="DELETE * FROM  UTILISATEURS WHERE no_utilisateur=?";
private static final String SELECT_ALL_FROM = "SELECT * FROM UTILISATEURS WHERE pseudo=? AND mot_de_passe=?";
private static final String FIND_USER_BY_ID="SELECT * FROM UTILISATEURS WHERE no_utilisateur=?";
private static final String FIND_USER_BY_PSEUDO="SELECT * FROM UTILISATEURS WHERE pseudo=?";
private static final String FIND_USER_BY_EMAIL="SELECT * FROM UTILISATEURS WHERE email=?";
private static final String UPDATE="UPDATE UTILISATEURS SET pseudo=?, nom=?, prenom=?, email=?, telephone=?, rue=?, code_postal=?, ville=?, mot_de_passe=?, credit=? WHERE no_utilisateur=?";



	static Connection con;
	static PreparedStatement ps;
	


	@Override
	public boolean Select_all(Utilisateur u)  {
			boolean status = false;
			try(Connection con = ConnectionProvider.getConnection())
			{
			PreparedStatement ps = con.prepareStatement(SELECT_ALL_FROM);
			ps.setString(1, u.getPseudo());
			ps.setString(2, u.getMotDePasse());
			ResultSet rs = ps.executeQuery();
			status = rs.next();

			} catch(Exception e) 
			
	
			{

			}
			return status;
	}


	@Override
	public void insert(fr.eni.ProjetEnchèresEni.bo.Utilisateur u) {
		int status=0;
		try {
			con=ConnectionProvider.getCon();
				
				ps=con.prepareStatement(INSERT,PreparedStatement.RETURN_GENERATED_KEYS);
						ps.setString(1,u.getPseudo());
						ps.setString(2,u.getNom());
						ps.setString(3,u.getPrenom());
						ps.setString(4,u.getEmail());
						ps.setString(5,u.getTelephone());
						ps.setString(6,u.getRue());
						ps.setInt(7,u.getCodePostal());
						ps.setString(8,u.getVille());
						ps.setString(9,u.getMotDePasse());
						ps.setInt(10,u.getCredit());
						ps.setBoolean(11,u.isAdministrateur());
						ps.executeUpdate();
						ResultSet rs= ps.getGeneratedKeys();
						if(rs.next())
						{
						u.setNoUtilisateur(rs.getInt(1));
						}
						}
						catch(Exception e)
						{
							System.out.println(e);
							
						}
							}
		
	



	@Override
		public boolean findByPseudo (fr.eni.ProjetEnchèresEni.bo.Utilisateur u) {
			boolean exists = false;
			try(Connection con = ConnectionProvider.getConnection())
			{
			PreparedStatement ps = con.prepareStatement(FIND_USER_BY_PSEUDO);
			ps.setString(1, u.getPseudo());
			ResultSet rs = ps.executeQuery();
			exists = rs.next();
			}
			catch (Exception e) {
			}
			return exists;
			
	}



	@Override
		public boolean findByEmail(fr.eni.ProjetEnchèresEni.bo.Utilisateur u) {
			
				boolean exists = false;
				try(Connection con = ConnectionProvider.getConnection())
				{
				PreparedStatement ps = con.prepareStatement(FIND_USER_BY_EMAIL);
				ps.setString(1,u.getEmail());
				ResultSet rs = ps.executeQuery();
				exists = rs.next();
				}
				catch(Exception e)
				{
				}
				return exists;
				}




	@Override
	public void update(fr.eni.ProjetEnchèresEni.bo.Utilisateur user) {
		try(Connection con = ConnectionProvider.getConnection())
		{
		PreparedStatement rqt = con.prepareStatement(UPDATE);
		ps.setString(1, user.getPseudo());
		ps.setString(2, user.getNom());
		ps.setString(3, user.getPrenom());
		ps.setString(4, user.getEmail());
		ps.setString(5, user.getTelephone());
		ps.setString(6, user.getRue());
		ps.setInt(7, user.getCodePostal());
		ps.setString(8, user.getVille());
		ps.setString(9, user.getMotDePasse());
		ps.setInt(10,user.getCredit());
		ps.setInt(11, user.getNoUtilisateur());
		ps.executeUpdate();
		}
		catch(Exception e)
		{
		}
		}
		
		
	



	@Override
	public void delete (fr.eni.ProjetEnchèresEni.bo.Utilisateur u) {
		
			try(Connection con = ConnectionProvider.getConnection())
			{
			PreparedStatement ps = con.prepareStatement(DELETE);
			ps.setInt(1, u.getNoUtilisateur());
			ps.executeUpdate();
			}
			catch(Exception e)	
			{
			}
			


		
		
}	
	


	

	@Override
	public fr.eni.ProjetEnchèresEni.bo.Utilisateur findById(int id){
	fr.eni.ProjetEnchèresEni.bo.Utilisateur u= new fr.eni.ProjetEnchèresEni.bo.Utilisateur();
	try(Connection con = ConnectionProvider.getConnection())
	{
		PreparedStatement ps =con.prepareStatement(FIND_USER_BY_ID);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
		u.setNoUtilisateur(rs.getInt(1));
		u.setPseudo(rs.getString(2));
		u.setNom(rs.getString(3));
		u.setPrenom(rs.getString(4));
		u.setEmail(rs.getString(5));
		u.setTelephone(rs.getString(6));
		u.setRue(rs.getString(7));
		u.setCodePostal(rs.getInt(8));
		u.setVille(rs.getString(9));
		
		u.setMotDePasse(rs.getString(10));
		u.setCredit(rs.getInt(11));
		u.setAdministrateur(rs.getBoolean(12));
		}
	}
	
	catch(Exception e)
	
	
	{
	}
	return u;
	}


	@Override
	public Utilisateur getUtilisateur(String uNo, String password) {
		// TODO Auto-generated method stub
		return null;
	}


	}

	







