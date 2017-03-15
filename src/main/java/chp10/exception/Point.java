package chp10.exception;

/**
 * Created by frlegros on 24/02/17.
 */
public class Point {

    private int x, y;

    public Point(int x, int y) throws ErrConst {

        if(x<0||y<0)
            throw new ErrConst("Erreur construction avec coordonnées: "+x+" "+ y);

        this.x = x;
        this.y = y;
    }

    public void deplace(int dx, int dy) throws ErrDepl{

        if(x+dx<0||y+dy<0)
            throw new ErrDepl("Erreur déplacement avec coordonnées: "+(x+dx)+" "+(y+dy));
        x += dx;
        y += dy;
    }

    public void affiche() {

        System.out.println("Je suis un HashSetPoint en " + x + " " + y);
    }

    @Override
    public String toString() {
        return "HashSetPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
