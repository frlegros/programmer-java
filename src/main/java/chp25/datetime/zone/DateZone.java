package chp25.datetime.zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Created by frlegros on 21/03/17.
 */
public class DateZone {

    public static void main(String[] args) {

        ZonedDateTime maintenant = ZonedDateTime.now();
        System.out.println("localDate aujourd'hui= " + maintenant);
        String dateFormatee = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(maintenant);
        System.out.println("localDate aujourd'huivau format Local= " + dateFormatee);

        ZoneId idChicago = ZoneId.of(ZoneId.SHORT_IDS.get("CST"));
        ZonedDateTime aChicago = ZonedDateTime.now(idChicago);
        System.out.println("Maintenant à Chicago= "+aChicago);
        dateFormatee = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(aChicago);
        System.out.println("localDate aujourd'huivau format Chicago= " + dateFormatee);

        ZoneId idChanghai = ZoneId.of(ZoneId.SHORT_IDS.get("CTT"));
        ZonedDateTime aChanghai = ZonedDateTime.now(idChanghai);
        System.out.println("Maintenant à Changhai= "+aChanghai);

        ZoneId idMinsk = ZoneId.of("Europe/Minsk");
        ZonedDateTime aMinsk = ZonedDateTime.now(idMinsk);
        System.out.println("Maintenant à Minsk= "+aMinsk);

//        System.out.println(ZoneId.getAvailableZoneIds());
    }


}
