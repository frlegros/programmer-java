package chp28.patterns.decorateur;


/**
 * Created by frlegros on 01/03/17.
 */
public class Point extends Affichable {

    private int x, y;
    public static int compteur=0;

    public Point() {
        this.x = 0;
        this.y = 0;
        compteur++;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        compteur++;
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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void affiche(){
        System.out.println(toString());
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

}
