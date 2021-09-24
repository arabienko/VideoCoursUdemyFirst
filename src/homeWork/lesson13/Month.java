package homeWork.lesson13;

public class Month {

    public static void month(int a) {

        switch (a) {
            case 2:
                System.out.println("28");
                break;
            case 6:
            case 4:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("Не существует");

        }
    }
    
    public static void main(String[] args) {
        month(5);
        Month.month(-3);
        month(6);
        Month.month(55);
    }
}
