package chp22.collection.linkedlist;

import org.junit.Test;

import java.util.LinkedList;
import java.util.ListIterator;

import static chp22.collection.linkedlist.List01.affiche;

/**
 * Created by frlegros on 12/03/17.
 */
public class List01Test {

    @Test
    public void testaffiche() throws Exception {

        LinkedList<String> l1 = new LinkedList<String>();
        System.out.println("Liste en A: ");affiche(l1);
        l1.add("a");
        l1.add("b");
        System.out.println("Liste en B: ");affiche(l1);

        ListIterator<String> it = l1.listIterator();
        it.next();
        it.add("c");
        System.out.println("Liste en C: ");affiche(l1);

        it = l1.listIterator();
        it.next();
        it.add("b");
        it.add("d");
        System.out.println("Liste en D: ");affiche(l1);

        it = l1.listIterator(l1.size());
        while (it.hasPrevious()){
            String ch = it.previous();
            if (ch.equals("b")){
                it.remove();
                break;
            }
        }
        System.out.println("Liste en E: ");affiche(l1);

        it = l1.listIterator();
        it.next();it.next();
        it.set("x");
        System.out.println("Liste en F: ");affiche(l1);

    }


}