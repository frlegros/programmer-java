package chp23.programmation.evenementielle;

import chp23.objet.Point;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by frlegros on 20/03/17.
 */
public class ExForEach {

    public static void main(String[] args) {

        List<Point> liste = new ArrayList<Point>();
        Point p1 = new Point(2,5);
        Point p2 = new Point(-2,3);
        Point p3 = new Point(6,-3);
        Point p4 = new Point(-3,-2);

        liste.add(p1);
        liste.add(p2);
        liste.add(p3);
        liste.add(p4);

        System.out.println("Boucle for{...}");
        for (Point p : liste){
            System.out.println("Array List elt: "+p);
        }

        System.out.println("Liste forEach{lambda}");
        liste.forEach(ee->{System.out.println("Array List elt: "+ee);});

        System.out.println("Liste tri absc{lambda}");
        liste.sort((pp1,pp2)->((Integer)(pp1.getX()))
                    .compareTo((Integer)(pp2.getX())));
        liste.forEach(ee->{System.out.println("Array List elt sorted: "+ee);});

        System.out.println("Liste tri ordonnees{lambda}");
        liste.sort(Comparator.comparing(Point::getY));
        liste.forEach(ee->{System.out.println("Array List elt sorted: "+ee);});


    }
}
