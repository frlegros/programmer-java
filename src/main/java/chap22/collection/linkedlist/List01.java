package chap22.collection.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by frlegros on 12/03/17.
 */
public class List01 {

    public static void affiche(LinkedList<String> l) {
        ListIterator<String> iter = l.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next()+" ");
        }
    }
}
