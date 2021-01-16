package fr.eni.ProjetEnchèresEni.messages;


import java.util.Locale;
import java.util.ResourceBundle;
	

	/**
	 * Cette classe permet de lire le contenu du fichier messages_erreurs.properties
	 *
	 *
	 */
	public class LecteurMessages {
		private static ResourceBundle rb;
		
		static
		{
			try
			{
				Locale currentLocale = Locale.getDefault();
				rb = ResourceBundle.getBundle("messages_erreur");
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		private LecteurMessages()
		{
			
		}
		/**
		 * @param code
		 * @return
		 */
		public static  String getMessageErreur(int code)
		{
			String message="";
			try
			{
				if(rb!=null)
				{
					message = rb.getString(String.valueOf(code));
				}
				else
				{
					message="Problème à la lecture du fichier contenant les messages";
				}
			}
			catch (Exception e) {
				e.printStackTrace();
				message="Une erreur inconnue est survenue";
			}
			System.out.println("message="+message);
			return message;
		}
	}


