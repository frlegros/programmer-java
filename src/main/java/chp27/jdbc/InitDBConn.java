package chp27.jdbc;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by frlegros on 09/04/17.
 */
public class InitDBConn {

    public Connection connectDB() {

        Connection conn = null;

        try{

            // chargement de la classe par son nom
            Class c = Class.forName("com.mysql.jdbc.Driver");
            Driver pilote = (Driver)c.newInstance() ;
            // enregistrement du pilote auprès du DriverManager
            DriverManager.registerDriver(pilote);
            // Protocole de connexion
            String protocole =  "jdbc:mysql:" ;
            // Adresse IP de l’hôte de la base et port
            String ip =  "localhost" ;  // dépend du contexte
            String port =  "3306" ;  // port MySQL par défaut
            // Nom de la base ;
            String nomBase =  "java_training" ;  // dépend du contexte
            // Chaîne de connexion
            String conString = protocole +  "//" + ip +  ":" + port +  "/" + nomBase ;
            // Identifiants de connexion et mot de passe
            String nomConnexion =  "root" ;  // dépend du contexte
            String motDePasse =  "SpU63root" ;  // dépend du contexte
            // Connexion
            conn = DriverManager.getConnection(
                    conString, nomConnexion, motDePasse) ;
        }catch(Exception e){
            e.printStackTrace();
        }
        return  conn;
    }
}
