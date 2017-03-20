package chp22.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by frlegros on 16/03/17.
 */
public class Tri01 {

    public static void main(String[] args) {
        int nb[] = {4,9,2,3,8,1,3,5};
        ArrayList<Integer> t = new ArrayList<Integer>();
        for (Integer v: nb) t.add(v);
        System.out.println("t initial= "+t);
        Collections.sort(t);
        System.out.println("t trie= "+t);
        Collections.shuffle(t);
        System.out.println("t melange= "+t);
        Collections.sort(t,Collections.reverseOrder());
        System.out.println("t melange= "+t);

    }
}
