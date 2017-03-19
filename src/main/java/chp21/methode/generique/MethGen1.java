package chp21.methode.generique;

/**
 * Created by frlegros on 08/03/17.
 */
public class MethGen1 {

    static <T> T hasard(T[] valeurs) {
        int n = valeurs.length;
        if (n == 0)
            return null;
        int i = (int) (n * Math.random());
        return valeurs[i];
    }
}
