package chp22.collection.ensemble;

/**
 * Created by frlegros on 01/03/17.
 */
public class HashSetPoint{

    private int x, y;

    public HashSetPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashSetPoint point = (HashSetPoint) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "HashSetPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
