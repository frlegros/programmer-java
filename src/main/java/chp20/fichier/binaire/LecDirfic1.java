package chp20.fichier.binaire;

import utils.Clavier;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by frlegros on 27/02/17.
 */
public class LecDirfic1 {

    public static void main(String[]args) throws IOException{

        String nomfich;
        int n,num;
        RandomAccessFile entree;

        System.out.println("Donnez le nom du fichier à lister:");
        nomfich = Clavier.lireString();

        entree = new RandomAccessFile(nomfich,"r");

        do{

            System.out.println("No de l'entier recherché: ");
            num = Clavier.lireInt();
            if(num==0)break;
            entree.seek(4*(num-1));
            n = entree.readInt();
            System.out.println("valeur= "+n);

        }while (num!=0);
        entree.close();
        System.out.println("Sortie du while");
    }
}
