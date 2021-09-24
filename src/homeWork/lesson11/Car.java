package homeWork.lesson11;

public class Car {

   public String color;
    public int countDoor;
    public String motor;

    public Car(String color, int countDoor, String motor) {
        this.motor = motor;
        this.color = color;
        this.countDoor = countDoor;
    }

    
}

class TestCar {
    
    public void changeDoor(Car car, int changeDoor) {
        car.countDoor = changeDoor;
    }

    void change(Car A1, Car A2) {
        String color1;

        color1 = A1.color;
        A1.color = A2.color;
        A2.color = color1;

    }
    
    

    public static void main(String[] args) {
        TestCar carTest=new TestCar();
        Car carOne = new Car("red", 4, "V6");
        Car carTwo = new Car("blue", 5, "V8");
        System.out.println("door- " + carOne.countDoor + " Color- " + carOne.color + " motor- " + carOne.motor);
        System.out.println("door- " + carTwo.countDoor + " Color- " + carTwo.color + " motor- " + carTwo.motor);
        carTest.changeDoor(carOne, 3);
        carTest.changeDoor(carTwo,6);
        System.out.println("door- " + carOne.countDoor + " Color- " + carOne.color + " motor- " + carOne.motor);
        System.out.println("door- " + carTwo.countDoor + " Color- " + carTwo.color + " motor- " + carTwo.motor);
        
        carTest.change(carOne,carTwo);
        System.out.println("door- " + carOne.countDoor + " Color- " + carOne.color + " motor- " + carOne.motor);
        System.out.println("door- " + carTwo.countDoor + " Color- " + carTwo.color + " motor- " + carTwo.motor);

    }
}
