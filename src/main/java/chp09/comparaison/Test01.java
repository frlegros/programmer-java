package chp09.comparaison;

import utils.Clavier;

/**
 * Created by frlegros on 21/02/17.
 */
public class Test01 {

    public void areStringsIdentical(){

        String ch;
        String ch1 = "bonjour";
        String ch2 = "bon";
        ch2 += "jour";

        if(ch1==ch2)
            System.out.println(ch1+" = "+ ch2);
        else
            System.out.println(ch1+" != "+ ch2);

        if(ch1.equals(ch2))
            System.out.println(ch1+" equals "+ ch2);
        else
            System.out.println(ch1+" non equals "+ ch2);
    }

}
