package homeWork.lesson16;

public class StringEmail {

    public void newStringEmail(String email) {
        int numberDog = 0;
        int numberSemicolon = 0;
        int semicolon = 0;
        char dog = '@';
        char semicolonChar = ';';
        char point = '.';
        String email1 = email.strip();
        while (semicolon < email1.length() - 1) {
            numberDog = email1.indexOf(dog, semicolon);
            numberSemicolon = email1.indexOf(point, semicolon);
            semicolon = email1.indexOf(semicolonChar, semicolon + 1);
            System.out.println("Method one: " + email1.substring(numberDog + 1, numberSemicolon));
        }
    }

    public static void stringEmail(String email) {
        int numberDog = 0;
        int numberSemicolon = 0;
        char dog = '@';
        char semicolon = ';';
        char point = '.';
        for (int i = 0; i <= email.length() - 1; i++) {
            if (email.charAt(i) == dog) {
                numberDog = i + 1;
            }
            if (email.charAt(i) == point) {
                numberSemicolon = i;
            }
            if (numberDog != 0 && numberSemicolon != 0) {
                System.out.println("Method two: " + email.substring(numberDog, numberSemicolon));
                numberDog = 0;
                numberSemicolon = 0;
            }
        }
    }

    public static void main(String[] args) {

        StringEmail str = new StringEmail();
        str.newStringEmail(": ya@yahoo.com; on@mail.ru;  ona@gmail.com;  ");
        System.out.println();
        String stroka = ": ya@yahoo.com; on@mail.ru;  ona@gmail.com; ";
        stringEmail(stroka);
    }

}
