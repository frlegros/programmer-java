package chap22.collection.arraylist;

import java.util.ArrayList;

/**
 * Created by frlegros on 12/03/17.
 */
public class Array01 {

    public static void main(String[] args) {

        ArrayList<Integer> v = new ArrayList<Integer>();
        System.out.println("En A: taille de v: "+v.size());

        for (int i=0;i<10;i++){
            v.add(new Integer(i));
        }
        System.out.println("En B: taille de v: "+v.size());

        for (Integer e: v){
            System.out.print(e+" ");
        }
        System.out.println();

        v.remove(3);
        v.remove(5);
        v.remove(5);
        System.out.println("En C: contenu de v: "+v);

        v.add(2,new Integer(100));
        v.add(2,new Integer(200));
        System.out.println("En D: contenu de v: "+v);

        v.set(2, new Integer(1000));
        v.set(5, new Integer(2000));
        System.out.println("En E: contenu de v: "+v);
    }
}
