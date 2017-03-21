package chp25.datetime.local.datetime;

import java.time.LocalDateTime;

/**
 * Created by frlegros on 21/03/17.
 */
public class PbDateTimeLoc {

    public static void main(String[] args) {

        LocalDateTime maintenant = LocalDateTime.now();
        System.out.println("Maintenant = "+maintenant);

        LocalDateTime dansUnMois = maintenant.plusMonths(1);
        System.out.println("Dans un mois = "+dansUnMois);

        LocalDateTime dansUnMois2 = maintenant.plusHours(31*24);
        System.out.println("Dans 31 fois 24h = "+dansUnMois2);

    }
}
