package homeWork.lesson18;

public class Animal {

    int eyes;

    Animal() {
        System.out.println("I am animal");
    }

    public void setEyes(int eye) {
        if (eye > 0 && eye < 5) {
            this.eyes = eye;
        }
    }

    public int getEyes() {
        return eyes;
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }

}

class Pet extends Animal {

    Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }

    String name;
    final int tail = 1;
    final int paw = 4;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {

    Dog(String n) {
        this.name = n;
        System.out.println("I am a dog and My name is " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

class Cat extends Pet {

    Cat(String n) {
        this.name = n;
        System.out.println("I am a cat and My name is " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

class test {

    public static void main(String[] args) {
        Dog dog = new Dog("Petty");
        System.out.println("kol-vo lap dog: "+ dog.paw);
        System.out.println();
        Cat cat = new Cat("Barsic");
        cat.sleep();
    }
}
