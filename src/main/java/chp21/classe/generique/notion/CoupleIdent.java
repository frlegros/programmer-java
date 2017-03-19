package chp21.classe.generique.notion;

/**
 * Created by frlegros on 06/03/17.
 */
public class CoupleIdent<T> {

    private T x,y;

    public CoupleIdent(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public void affiche(){
        System.out.println("Première valeur: "+x+" - Deuxième valeur: "+y);
    }

    T getPremier(){
        return x;
    }

    void  setPremier(T premier){
        this.x = premier;
    }

    T getDeuxieme(){
        return y;
    }
}
