package chp22.collection.linkedlist;

import utils.Clavier;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by frlegros on 12/03/17.
 */
public class List02 {

    public static void main(String[] args) {

        LinkedList<String> l = new LinkedList<String>();
        System.out.println("Donez une suite de mots (vide pour finir)");
        while (true){
            String ch = Clavier.lireString();
            if (ch.isEmpty()) break;
            l.add(ch);
        }
        System.out.println("");
        System.out.println("Liste des mots à l'endroit: ");
        ListIterator<String> iter = l.listIterator();
        while (iter.hasNext()){
            System.out.print(iter.next()+" ");
        }

        System.out.println("");
        System.out.println("Liste des mots à l'envers: ");
        iter = l.listIterator(l.size());
        while (iter.hasPrevious()){
            System.out.print(iter.previous()+" ");
        }
    }
}
