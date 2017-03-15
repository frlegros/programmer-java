package chap22.collection.ensemble;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by frlegros on 13/03/17.
 */
public class TreeSet01 {

    public static void main(String[] args) {

        int t[] = {2, 5, -6, 2, -8, 9, 5};
        TreeSet<Integer> ens = new TreeSet<Integer>();

        for (int v: t){
            boolean ajoute = ens.add(v);
            if (ajoute)
                System.out.println("On ajoute: "+v);
            else
                System.out.println(v+" est déjà présent");

        }
        System.out.println("Ensemble en A= "+ens);

        Integer cinq = 5;
        boolean enleve = ens.remove(cinq);
        if (enleve)
            System.out.println("On a supprimé: "+cinq);
        System.out.println("Ensemble en B= "+ens);

    }
}
