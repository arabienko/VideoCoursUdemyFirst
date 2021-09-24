package homeWork.lesson8;

public class test {

    static int multiply(int a, int b, int c) {
        int d = a * b * c;
        return d;
    }

    static void division(int a, int b) {
        double d = a / b;
        System.out.println("division " + d);
    }
}

class testNew {

    public static void main(String[] args) {

        System.out.println(test.multiply(3, 4, 5));
        test.division(4, 3);
        
        System.out.println(test.multiply(8, 4, 6));
        test.division(9, 3);
    }
}
