package chp28.patterns.comportementaux.pattern.strategie;


/**
 * Created by frlegros on 01/03/17.
 */
public class Point {

    private int x, y;
    public static int compteur=0;
    ModeAffichage ma;

    public Point() {
        this.x = 0;
        this.y = 0;
        compteur++;
    }

    public Point(int x, int y, ModeAffichage ma) {
        this.x = x;
        this.y = y;
        this.ma = ma;
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
        ma.presente(this.x, this.y);
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

}
