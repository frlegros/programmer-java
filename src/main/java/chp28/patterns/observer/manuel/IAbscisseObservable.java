package chp28.patterns.observer.manuel;

/**
 * Created by frlegros on 27/03/17.
 */
public interface IAbscisseObservable {

    public void saveObserver(AObservateurDAbscisses obs);
    public void notifyObserver();
}
