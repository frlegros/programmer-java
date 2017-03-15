package chp20.fichier.texte;

import utils.Clavier;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by frlegros on 28/02/17.
 */
public class Ecrtxt1 {

    public static void main(String[] args) throws IOException{

        String nomfich;
        int n;

        System.out.println("Donner le nom du fichier à créer");

        nomfich = Clavier.lireString();

        PrintWriter sortie = new PrintWriter(
                                new BufferedWriter(
                                        new FileWriter(nomfich)));

        do{
            System.out.print("Donner un entier: ");
            n = Clavier.lireInt();
            if (n!=0)
                sortie.println(n+" a pour carré "+n*n);
        }
        while (n!=0);

        sortie.close();
    }
}
