package chp25.datetime.local.date;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by frlegros on 21/03/17.
 */
public class LocDate {

    public static void main(String[] args) {

        LocalDate aujourdhui = LocalDate.now();
        System.out.println("localDate aujourd'hui= " + aujourdhui);
        System.out.println("Nous sommes un = " + aujourdhui.getDayOfWeek());
        System.out.println("Nous sommes en = " + aujourdhui.getDayOfYear());

        LocalDate maDateDeNaissance = LocalDate.of(1966, 8, 22);
        System.out.println("localDate ma date de naissance= " + maDateDeNaissance);

        Period ecart = maDateDeNaissance.until(aujourdhui);
        System.out.println("Ecart = " + ecart);
        System.out.println("Ecart = " + ecart.getYears() + " années " + ecart.getMonths() + " mois " + ecart.getDays() + " jours");

        LocalDate dansTroisMois = aujourdhui.plusMonths(3);
        System.out.println("localDate dans 3 mois= " + dansTroisMois);

    }
}
