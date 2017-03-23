package chp28.patterns.factory.logos;

/**
 * Created by frlegros on 23/03/17.
 */
public class FabriqueLogoAlternes extends FabriqueLogo{

    public static boolean indic = false;

    public Logo getLogo(){
        if (indic){
            indic = false;
            return new LogoCercle();
        }
        else{
            indic = true;
            return new LogoRectangle();
        }
    }
}
