package chp20.fichier.objet;

import java.io.*;

/**
 * Created by frlegros on 01/03/17.
 */
public class LectficObj {

    public static void main(String[] args) throws Exception{

        String s = File.separator;
        File f = new File("src"+s+"main"+s+"files"+s+"point.dat");

        ObjectInputStream entree = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(f)));

        Point p = null;
        int num;
        boolean eof = false;
        while (!eof){
            try{
                num = entree.readInt();
                p = (Point) entree.readObject();
                System.out.println("point numéro: "+num);
                p.affiche();
            }catch (EOFException e){
                eof=true;
            }catch (Exception e){
                System.out.println("Fin lecture fichier d'objets");
            }
        }
        entree.close();


    }

}
