package chap22.collection.ensemble;

import java.util.HashSet;

/**
 * Created by frlegros on 13/03/17.
 */
public class EnsLettres {

    public static void main(String[] args) {
        String phrase = "je me figure ce zouave qui joue";
        HashSet<String> lettres = new HashSet<String>();
        for (int i=0;i<phrase.length();i++){
            lettres.add(phrase.substring(i,i+1));
        }
        System.out.println("Lettres présentes: "+lettres);

        String voy = "aeiouy";
        HashSet<String> voyelles = new HashSet<String>();
        for (int i=0;i<voy.length();i++){
            voyelles.add(voy.substring(i,i+1));
        }
        lettres.removeAll(voyelles);
        System.out.println("lettres sans voyelles: "+lettres);

    }
}
