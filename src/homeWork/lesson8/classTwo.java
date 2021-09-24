package homeWork.lesson8;

public class classTwo {

    static final double PI = 3.14;

    public void square(int rad) {
        double sq = PI * rad * rad;
        System.out.println("Площадь круга: " + sq);
    }

    static void circle(int rad) {
        double cir = PI * rad * 2;
        System.out.println("Длина окружности: " + cir);
    }

    void showAll(int rad) {
        square(rad);//this
        circle(rad);//this
        System.out.println("Радиус: " + rad);
    }

}

class classThree {

    public static void main(String[] args) {
        classTwo ct = new classTwo();
        ct.square(5);
        classTwo.circle(5);
        ct.showAll(5);
    }
}
