package chp23.expression.lambda;

/**
 * Created by frlegros on 18/03/17.
 */
public class RefStat {

    public static void main(String[] args) {

        traite(5,RefStat::carre);
        traite(5,RefStat::trinome);
    }

    public static void traite(int n, Calculateur cal){
        int res = cal.calcul(n);
        System.out.println("calcul("+n+")= "+res);

    }

    public static int carre(int n){return n*n;}
    public static int trinome(int n){return 2*n*n+3*n+5;}
}
