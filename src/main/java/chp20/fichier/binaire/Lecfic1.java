package chp20.fichier.binaire;

import utils.Clavier;

import java.io.*;

/**
 * Created by frlegros on 27/02/17.
 */
public class Lecfic1 {


    public static void main(String[] args) throws IOException{

        String nomfich;
        int n=0;

        System.out.println("Donnez le nom du fichier à lister:");
        nomfich = Clavier.lireString();
        DataInputStream entree = new DataInputStream(
                                    new BufferedInputStream(
                                        new FileInputStream(nomfich)));
        System.out.println("valeurs lues dans le fichier "+nomfich+": ");
        boolean eof = false;
        while (!eof){

            try{
                n = entree.readInt();
            }catch (EOFException e){
                eof =true;
                System.out.println("eof: fin lecture fichier");
            }
            if(!eof)
                System.out.println(n);
        }
        System.out.println("Sortie du while");
        entree.close();
    }
}
