package chp28.patterns.structure.adapteur.classe;

import chp28.patterns.structure.adapteur.IPixel;
import chp28.patterns.structure.adapteur.PointX;

/**
 * Created by frlegros on 23/03/17.
 */
public class PointXAdapteC extends PointX implements IPixel{

    public PointXAdapteC(PointX px) {
        super (px.getX(),px.getY());
    }

    public void affiche() {
        super.montre();
    }

    public void deplace(int dx, int dy){
        deltaX(dx);
        deltaY(dy);
    }
}
