package chp28.patterns.observer.manuel;

import java.util.ArrayList;

/**
 * Created by frlegros on 27/03/17.
 */
public class Point extends Pixel implements IAbscisseObservable{

    private String nom;

    private ArrayList<AObservateurDAbscisses> listObs;

    public Point(String nom, int x, int y) {
        super(x, y);
        this.nom =nom;
        listObs = new ArrayList<AObservateurDAbscisses>();
    }

    public void deplace(int dx, int dy){
        super.deplace(dx,dy);
        if (dx!=0) notifyObserver();
    }

    public void saveObserver(AObservateurDAbscisses obs){

        listObs.add(obs);
    }

    public void notifyObserver(){
        if (listObs!=null)
            for (AObservateurDAbscisses obs: listObs){
                obs.update(this);
            }
    }

    public String getNom() {
        return nom;
    }
}
