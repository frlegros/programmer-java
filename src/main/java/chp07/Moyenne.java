package chp07;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.rmi.runtime.Log;
import utils.Clavier;


/**
 * Created by frlegros on 03/02/17.
 */
public class Moyenne {

    final static Logger LOG = LogManager.getLogger(Moyenne.class);

    public static void main(String[] args) {

        int i,nbEl,nbElSupMoy;
        double somme, moyenne;


//        LOG.info("Hello word");
        System.out.print("Combien d'élèves : ");
        nbEl = Clavier.lireInt();

        double notes[] = new double[nbEl];

        for (i=0, somme=0;i<nbEl;i++){
            System.out.print("Donnez la note no "+(i+1)+ " : ");
            notes[i]= Clavier.lireDouble();
            somme += notes[i];
        }


        moyenne = somme / nbEl;
        System.out.println("Moyenne de la classe : "+moyenne);

        for (i=0, nbElSupMoy=0;i<nbEl;i++){
            if(notes[i]>moyenne)
            nbElSupMoy += 1;
        }
        System.out.print(nbElSupMoy+" élèves ont plus de la moyenne");

    }
}
