package chp23.expression.lambda;

/**
 * Created by frlegros on 17/03/17.
 */
public class IntroLambdaComplique1 {


    public static void main(String[] args) {
        int n1 = 5, n2 = 4, n3 = -5;

        Calculateur complique = x -> {if (x>0 && 2*(x/2)==x) return x;
                                else if (x > 0) return x + 1;
                                else return -x;
                                };

        int res = complique.calcul(n1);
        System.out.println("Carré de "+n1+" = "+res);
        System.out.println("Carré de "+n2+" = "+complique.calcul(n2));
        System.out.println("Carré de "+n3+" = "+complique.calcul(n3));

    }
}
