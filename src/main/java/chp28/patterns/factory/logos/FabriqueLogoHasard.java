package chp28.patterns.factory.logos;

/**
 * Created by frlegros on 23/03/17.
 */
public class FabriqueLogoHasard extends FabriqueLogo{

    public Logo getLogo(){
        if (Math.random()<0.5)
            return new LogoCercle();
        else
            return new LogoRectangle();
    }
}
