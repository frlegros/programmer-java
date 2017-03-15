package chap22.collection.ensemble;

/**
 * Created by frlegros on 15/03/17.
 */
public class ComparablePoint implements Comparable{

    public int x, y;

    public ComparablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object pp) {
        ComparablePoint p = (ComparablePoint) pp;
        if (this.x<p.x) return -1;
        else if (this.x == p.x) return 0;
        else return 1;
    }

    @Override
    public String toString() {
        return "ComparablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
