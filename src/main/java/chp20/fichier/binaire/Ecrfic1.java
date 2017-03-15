package chp20.fichier.binaire;

import utils.Clavier;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by frlegros on 26/02/17.
 */
public class Ecrfic1 {

    public static void main(String[] args) throws IOException{
        String nomFich;
        int n;
        System.out.println("Nom du fichier à créer:");
        nomFich = Clavier.lireString();
        DataOutputStream sortie = new DataOutputStream(
                                    new BufferedOutputStream(
                                            new FileOutputStream(nomFich)));

        do{
            System.out.println("Donnez un entier: ");
            n = Clavier.lireInt();
            if(n!=0)
                sortie.writeInt(n);

        }while (n!=0);
        sortie.close();

    }
}
