package chap22.collection.ensemble;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by frlegros on 13/03/17.
 */
public class EnsOp {

    public static void main(String[] args) {
        int t1[] = {2,5,6,8,9};
        int t2[] = {3,6,7,9};

        HashSet<Integer> e1 = new HashSet<Integer>(),
                e2 = new HashSet<Integer>();

        for (int v: t1) e1.add(v);
        for (int v: t2) e2.add(v);

        System.out.println("e1= "+e1);
        System.out.println("e2= "+e2);

        HashSet<Integer> u1 = new HashSet<Integer>();
        copie(u1, e1);
        System.out.println("copie u1= "+u1);
        u1.addAll(e2);
        System.out.println("u1.addAll(e2)= "+u1);

        HashSet<Integer> i1 = new HashSet<Integer>();
        copie(i1, e1);
        System.out.println("copie i1= "+i1);
        i1.retainAll(e2);
        System.out.println("i1.retainAll(e2)= "+i1);
    }

    private static  <E> void copie(HashSet<E> but, HashSet<E> source){
        Iterator<E> iter = source.iterator();
        while (iter.hasNext())
            but.add(iter.next());
    }

}
