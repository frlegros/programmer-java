package chp22.collection.ensemble;

/**
 * Created by frlegros on 01/03/17.
 */
public class TreeSetPoint implements Comparable{

    private int x, y;

    public TreeSetPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object pp) {

        TreeSetPoint p = (TreeSetPoint) pp;
        if(this.x<p.x) return -1;
        else if (this.x>p.x) return 1;
        else if (this.y<p.y) return -1;
        else if (this.y>p.y) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "TreeSetPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
