package chp23.expression.lambda;

/**
 * Created by frlegros on 18/03/17.
 */
public class ReturnLambda {

    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            traite(4,fabriqueStatique());
        }
    }

    public  static void traite(int n, Calculateur cal){
        int res = cal.calcul(n);
        System.out.println("calcul("+n+")= "+res);
    }

    public static Calculateur fabriqueStatique(){
        double x = Math.random();
        if (x<0.5) return xx->xx*xx;
        else return xx->2*xx;

    }
}
