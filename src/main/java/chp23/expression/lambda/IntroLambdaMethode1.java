package chp23.expression.lambda;

/**
 * Created by frlegros on 17/03/17.
 */
public class IntroLambdaMethode1 {


    public static void main(String[] args) {

        traite(5,x->x*x);
        traite(12,x->2*x*x+3*x+5);


    }

    public static void traite(int n, Calculateur cal) {

        int res = cal.calcul(n);
        System.out.println("Calcul ("+n+") = "+res);
    }
}
