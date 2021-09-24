
package homeWork.lesson12;

import homeWork.lesson11.Car;

public class StTest {
    public static void method1(Car c1, Car c2){
        if (c1.color.equals(c2.color) && (c1.countDoor == c2.countDoor) && c1.motor.equals(c2.motor)){
                    System.out.println("Cars are equals");}
        else {System.out.println("Cars are not equals");}
    
    }
    
    public static void main(String[] args) {
       Car car1 = new Car("red", 4, "V6");
        Car car2 = new Car("red", 4, "V6");
        method1(car1,car2);
    }
    
}
