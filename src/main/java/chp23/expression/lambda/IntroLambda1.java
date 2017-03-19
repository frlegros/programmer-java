package chp23.expression.lambda;

/**
 * Created by frlegros on 17/03/17.
 */
public class IntroLambda1 {


    public static void main(String[] args) {
        int n1 = 5, n2 = 3;

        Calculateur carre = x -> x * x;

        int res = carre.calcul(n1);
        System.out.println("Carré de "+n1+" = "+res);
        System.out.println("Carré de "+n2+" = "+carre.calcul(n2));

    }
}
