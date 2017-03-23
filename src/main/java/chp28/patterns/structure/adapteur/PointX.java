package chp28.patterns.structure.adapteur;

/**
 * Created by frlegros on 23/03/17.
 */
public class PointX {
    private int x, y;

    public PointX(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void montre(){
        System.out.println("Coordonnées= "+x+" "+y);
    }

    public void deltaX(int dx){this.x += dx;}
    public void deltaY(int dy){this.y += dy;}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
