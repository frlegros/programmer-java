package chp23.streams;

import chp23.objet.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by frlegros on 20/03/17.
 */
public class StreamEx01 {

    public static void main(String[] args) {
        List<Integer> liste;
        Integer tab[]= {1,-5,10,-9,4, 9};
        liste = Arrays.asList(tab);
        System.out.println("forEach List Integer");
        liste.stream().filter(ee->ee>0).forEach(ee-> System.out.println(ee+" "));

        List<Point> listePoints;
        Point tabPoints[] =  {new Point(2,5),new Point(-2,3),new Point(6,-3),new Point(-3,-2)};
        listePoints = Arrays.asList(tabPoints);
        System.out.println("forEach List Points");
        listePoints.stream().map(pp->pp.getX()+pp.getY())
                            .filter(xx->xx>0)
                            .forEach(xx-> System.out.println(xx+" "));
    }
}
