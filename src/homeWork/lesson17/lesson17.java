package homeWork.lesson17;

public class lesson17 {

    public static boolean ravenstvo(StringBuilder strOne, StringBuilder strTwo) {
        boolean db = true;

        if (strOne.length() == strTwo.length()) {
            System.out.println("23");
            for (int i = 0; i < strOne.length(); i++) {
                System.out.println("321");
                if (strOne.charAt(i) == strTwo.charAt(i)) {
                    System.out.println(strOne.charAt(i));
                    db = false;
                    break;
                }
            }

        } else {
            db = false;
        }

        return db;
    }
}

class lesson17Test {

    public static void main(String[] args) {

        StringBuilder strBuil1 = new StringBuilder("hello");
        StringBuilder strBuil2 = new StringBuilder("gello");
        StringBuilder strBuil3 = new StringBuilder("Hello");

        System.out.println(lesson17.ravenstvo(strBuil2, strBuil2));
    }
}
