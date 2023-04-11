package DAO;
import java.sql.*; 
import MODUL.Eleve; 

public class EleveDAO  extends ConnectionDAO {
		public EleveDAO() {
		 super(); 
		 }
		public int add(Eleve Eleve) {
			 Connection con = null;
			 PreparedStatement ps = null;
			 int returnValue = 0;
			 // connexion a la base de donnees
			 try {
			 // tentative de connexiAon
			 con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			 // preparation de l'instruction SQL, chaque ? represente une valeur
			 // a communiquer dans l'insertion.
			 // les getters permettent de recuperer les valeurs des attributs souhaites
			 ps = con.prepareStatement("INSERT INTO eleve (ID_ELEVE,PRENOM_ELEVE, MAIL_ELEVE ,FILIERE_ELEVE, NOM_ELEVE, MDP_ELEVE) VALUES (?,?,?,?,?,?)"); 
			 ps.setInt(1, Eleve.getId());
			 ps.setString(2, Eleve.getPrenom());
			 ps.setString(3, Eleve.getMail());
			 ps.setString(4, Eleve.getFiliere());
			 ps.setString(5, Eleve.getNom());
			 ps.setString(6, Eleve.getMotDePasse());
			 
			 
			 // Execution de la requete
			 returnValue = ps.executeUpdate();
			 } 
			 catch (Exception e) {
				 if (e.getMessage().contains("ORA-00001"))
					 	System.out.println("Cet identifiant de fournisseur existe déjà. Ajout impossible !");
			 else
			 e.printStackTrace();
			 } 
			 finally {
			 // fermeture du preparedStatement et de la connexion
			 try {
			 if (ps != null) {
			 ps.close();
			 	}
			 } catch (Exception ignore) {
			 }
			 try {
			 if (con != null) {
			 con.close();
			 	}
			 } catch (Exception ignore) {
			 }
			 }
			 return returnValue;
			 }
			public int update(Eleve Eleve ){
			 Connection con = null;
			 PreparedStatement ps = null;
			 int returnValue = 0;
			return returnValue; 

			}
			public static void main(String[] args) throws SQLException  {
		         int returnValue;
		         //int[] ids = {24252, 42412, 42400};
		             EleveDAO EleveDAO = new EleveDAO();
		             Eleve e = new Eleve(123, "jojo", "azerty@gmgm.com", "energie", "appren","10");
		       
		            returnValue= EleveDAO.add(e);
		            System.out.println(returnValue + " etudiant ajoute");

				}
}
