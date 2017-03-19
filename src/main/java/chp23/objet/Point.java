package chp23.objet;

import java.io.Serializable;

/**
 * Created by frlegros on 01/03/17.
 */
public class Point implements Serializable{

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceX(Point p){
        return p.getX()-getX();
    }

    public int distanceY(Point p){
        return p.getY()-getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void affiche(){
        System.out.println("Coordonnées= "+x+" "+y);
    }
}
