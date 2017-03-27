package chp28.patterns.observer.automatique;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by frlegros on 25/03/17.
 */
public class ObservateurDePoints implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        if (o instanceof Point){

            System.out.println("Nouvelle abscisse "+((Point) o).getX()+" dans le Point de nom "+((Point) o).getNom());
            ((Point) o).affiche();
        }
    }
}
