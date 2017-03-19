package chp23.expression.lambda;

import chp23.objet.Point;

/**
 * Created by frlegros on 19/03/17.
 */
public class RefMethClasse {

    public static void main(String[] args) {
        Point p1 = new Point(1,3);
        Point p2 = new Point(3,8);
        Distanciable dlamb = (pp1,pp2)->pp2.getX()-pp1.getX();
        System.out.println("distance entre P1 et P2: "+dlamb.distance(p1,p2));
        Distanciable dX = Point::distanceX;
        System.out.println("distance X: "+dX.distance(p1,p2));
        Distanciable dY = Point::distanceY;
        System.out.println("distance Y: "+dY.distance(p1,p2));
    }
}
