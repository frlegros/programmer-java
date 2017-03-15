package chap21.classe.generique.notion;

/**
 * Created by frlegros on 06/03/17.
 */
public class CoupleDiff <T,U>{

    private T x;
    private U y;

    public CoupleDiff(T x, U y) {
        this.x = x;
        this.y = y;
    }

    public void affiche(){
        System.out.println("Première valeur: "+x+" - Deuxième valeur: "+y);
    }

    public T getPremier(){
        return x;
    }

    public U getDeuxieme(){
        return y;
    }
}
