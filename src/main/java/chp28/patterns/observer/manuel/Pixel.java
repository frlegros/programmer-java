package chp28.patterns.observer.manuel;

/**
 * Created by frlegros on 27/03/17.
 */
public class Pixel {

    private int x,y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void deplace(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
}
