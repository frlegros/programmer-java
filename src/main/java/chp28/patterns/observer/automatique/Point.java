package chp28.patterns.observer.automatique;


import java.util.Observable;

/**
 * Created by frlegros on 01/03/17.
 */
public class Point extends Observable {

    private String nom;
    private int x, y;
    public static int compteur=0;

    public Point(String nom, int x, int y) {
        this.nom = nom;
        this.x = x;
        this.y = y;
        compteur++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {this.x = x;}

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    @Override
    public String toString() {
        return "Point{" +
                "nom='" + nom + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void affiche(){
        System.out.println(toString());
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
        if (dx!=0)
            setChanged();
        notifyObservers();
    }

}
