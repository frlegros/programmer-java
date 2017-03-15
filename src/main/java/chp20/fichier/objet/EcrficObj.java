package chp20.fichier.objet;

import java.io.*;

/**
 * Created by frlegros on 01/03/17.
 */
public class EcrficObj {

    public static void main(String[] args) throws IOException{

        String s = File.separator;
        File f = new File("src"+s+"main"+s+"files"+s+"point.dat");

        ObjectOutputStream sortie = new ObjectOutputStream(
                                        new BufferedOutputStream(
                                                new FileOutputStream(f)));

        Point p;

        for (int i=0;i<5;i++){
            p = new Point(i,i*2);
            sortie.writeInt(i);
            sortie.writeObject(p);
        }
        sortie.close();
    }
}
