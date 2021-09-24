package homeWork.lesson15;

public class TimeOnScreenWhile {

    public static void timeScreen() {
        int hour1 = 0;
               
        AUTER:
        while (hour1 <= 6) {
            int minute1 = 0;
            MIDDLE:
            do {
                int second1 = 0;
                
                if (hour1 > 1 && (minute1 % 10 == 0)) {
                    break AUTER;
                }
                
                INNER:
                while (second1<=59) {
                    
                    if (second1 * hour1 > minute1) {
                        continue MIDDLE;
                    }

                    System.out.println(hour1 + ":" + minute1 + ":" + second1);
                    second1++;
                }
                minute1++;
            } while (minute1 <= 59);
            hour1++;
        }
        
        
        /*AUTER:
        for (int hour = 0; hour <= 6; hour++) {

            MIDDLE:
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && (minute % 10 == 0)) {
                    break AUTER;
                }
                INNER:
                for (int second = 0; second <= 59; second++) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }

                    System.out.println(hour + ":" + minute + ":" + second);

                }
            }
        }*/

    }

    public static void main(String[] args) {
        timeScreen();

    }

}
