package utils.classe;


/**
 * Created by frlegros on 12/02/17.
 */
public class PointCol extends Point {

    private byte couleur;

    public PointCol(int x, int y, byte couleur) {
        super(x, y);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "PointCol{" +
                "couleur=" + couleur +
                '}';
    }
}
