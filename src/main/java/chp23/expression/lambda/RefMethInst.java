package chp23.expression.lambda;

import chp23.objet.Point;

/**
 * Created by frlegros on 19/03/17.
 */
public class RefMethInst {

    public static void main(String[] args) {
        Point p1 = new Point(1,3),
              p2 = new Point(3,8),
              origine = new Point(0,0),
              p = new Point(1,2);

        DistanciableDe distOrig = origine::distanceX;
        System.out.println("Distance de p1 à origine: "+distOrig.distance_a(p1));

        DistanciableDe distP = p::distanceX;
        System.out.println("Distance de p2 à p: "+distP.distance_a(p));


    }
}
