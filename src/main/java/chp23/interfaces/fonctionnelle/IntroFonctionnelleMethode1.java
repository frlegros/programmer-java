package chp23.interfaces.fonctionnelle;


import java.util.function.IntUnaryOperator;

/**
 * Created by frlegros on 17/03/17.
 */
public class IntroFonctionnelleMethode1 {


    public static void main(String[] args) {

        traite(5,x->x*x);
        traite(12,x->2*x*x+3*x+5);


    }

    public static void traite(int n, IntUnaryOperator cal) {

        int res = cal.applyAsInt(n);
        System.out.println("Calcul ("+n+") = "+res);
    }
}
