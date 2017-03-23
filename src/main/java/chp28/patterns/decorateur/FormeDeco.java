package chp28.patterns.decorateur;

/**
 * Created by frlegros on 23/03/17.
 */
public class FormeDeco extends Affichable{

    private Affichable p;

    private char f;

    public FormeDeco(Affichable p, char f) {
        this.p = p;
        this.f = f;
    }

    public void affiche(){
        p.affiche();
        System.out.println(" Forme: "+f);
    }
}
