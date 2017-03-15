package chp20.fichier.texte;

import utils.Clavier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by frlegros on 28/02/17.
 */
public class Lecttxt1 {

    public static void main(String[] args) throws IOException{

        String nomfich;
        String ligne;
        System.out.print("Donnez le nom du fichier à lister: ");
        nomfich = Clavier.lireString();
        BufferedReader entree = new BufferedReader(new FileReader(nomfich));

        while ((ligne=entree.readLine())!=null)
            System.out.println(ligne);

        entree.close();
    }
}
