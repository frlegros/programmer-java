package chp08.extend;

/**
 * Created by frlegros on 12/02/17.
 */
public class PointCol extends Point {

    private byte couleur;

    public PointCol(int x, int y, byte couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    public void affiche() {
        super.affiche();
        System.out.println(" et ma couleur est : " + couleur);
    }

    @Override
    public String toString() {
        return "PointCol{" +
                "couleur=" + couleur +
                '}';
    }
}
