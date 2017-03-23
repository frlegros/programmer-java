package chp28.patterns.structure.adapteur.objet;

import chp28.patterns.structure.adapteur.IPixel;
import chp28.patterns.structure.adapteur.PointX;

/**
 * Created by frlegros on 23/03/17.
 */
public class PointXAdapteO implements IPixel{

    private PointX px;

    public PointXAdapteO(PointX px) {
        this.px = px;
    }

    public void affiche() {
        px.montre();
    }

    public void deplace(int dx, int dy){
        px.deltaX(dx);
        px.deltaY(dy);
    }
}
