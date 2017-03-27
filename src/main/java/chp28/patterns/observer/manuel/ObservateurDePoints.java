package chp28.patterns.observer.manuel;

/**
 * Created by frlegros on 27/03/17.
 */
public class ObservateurDePoints extends AObservateurDAbscisses{

    public void update(IAbscisseObservable o){

        if (o instanceof Point){
            System.out.println("Nouvelle abscisse "+((Point) o).getX()+" dans le Point de nom "+((Point) o).getNom());
        }


    }
}
