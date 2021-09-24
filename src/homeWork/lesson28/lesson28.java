package homeWork.lesson28;

import static homeWork.lesson28.format.smena;
import java.time.*;
import java.time.format.*;

public class lesson28 {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(1986, Month.JUNE, 29, 15, 30);
        LocalDateTime ldt2 = LocalDateTime.of(1985, Month.MARCH, 5, 2, 20);
        Period p = Period.ofMonths(2);
        Duration d = Duration.ofDays(31);
        smena(ldt1, ldt2, p, d);
    }
}

class format {

    static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
    static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    static void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        LocalDateTime ldt11 = ldt1;
       
        do {
            System.out.print("Work from: " + ldt11.format(dtf1)+"  ---  ");
            ldt11 = ldt11.plus(p);
            System.out.println("Work to:" + ldt11.format(dtf1));
            System.out.print("Rest from: " + ldt11.format(dtf2)+"  --  ");
            ldt11 = ldt11.plus(d);
            System.out.println("Rest to: " + ldt11.format(dtf2));

        } while (ldt11.isBefore(ldt2));

    }

}
