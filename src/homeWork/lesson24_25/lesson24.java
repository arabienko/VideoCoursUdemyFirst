package homeWork.lesson24_25;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class lesson24 {

    public static void main(String[] args) {
        File fl=new File("file.txt");
        
        try {
            FileInputStream fis=new FileInputStream(fl);
//        Mechenosec mech = new Mechenosec("Mechenosec");
//        System.out.println(mech.name);
//        mech.eat();
//        mech.sleep();
//        mech.swim();
//
//        System.out.println();
//        Speakable speak = new Pinguin("Pinguin");
//        speak.speak();
//
//        System.out.println();
//        Animal lev = new Lev("Lev");
//        System.out.println(lev.name);
//        lev.eat();
//        lev.sleep();
//
//        System.out.println();
//        Mammal lev2 = new Lev("LewTwo");
//        System.out.println(lev2.name);
//        lev2.eat();
//        lev2.run();
//        lev2.sleep();
//        lev2.speak();
        } catch (FileNotFoundException ex) {
            System.out.println("exeption");
        }

        Speakable pingS = new Pinguin("pingS");
        Speakable levS = new Lev("levS");

        Animal mechAn = new Mechenosec("mechAn");
        Animal pinAn = new Pinguin("pinAn");
        Animal levAn = new Lev("levAn");

        Mechenosec mech = new Mechenosec("mech");
        Fish mechFish = new Mechenosec("mechFish");
        Pinguin ping = new Pinguin("ping");
        Bird pingBird = new Pinguin("pingBird");
        Lev lev = new Lev("lev");
        Mammal levMm = new Lev("levMm");

        Animal[] array1 = {ping, pingBird, pinAn, mech, mechAn, mechFish, lev, levMm, levAn};
        Speakable[] array2 = {ping, pingS, pingBird, lev, levS, levMm,};

        for (Animal s : array1) {
            if (s instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) s;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if (s instanceof Pinguin) {
                Pinguin m = (Pinguin) s;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.fly();
                m.speak();
            } else if (s instanceof Lev) {
                Lev m = (Lev) s;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.run();
                m.speak();

            }
        }

        System.out.println("----------------------");

        for (Speakable s : array2) {
            if (s instanceof Pinguin) {
                Pinguin p = (Pinguin) s;
                System.out.println(p.name);
                p.eat();
                p.fly();
                p.sleep();
                p.speak();
            } else if (s instanceof Lev) {
                Lev p = (Lev) s;
                System.out.println(p.name);
                p.eat();
                p.run();
                p.sleep();
                p.speak();
            }
        }

    }
}

abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();

}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {

    default void speak() {
        System.out.println("Somebody speaks");
    }

}

class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }

}

class Pinguin extends Bird {

    Pinguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }

    @Override
    void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
    void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

}

class Lev extends Mammal {

    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }

    @Override
    void eat() {
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    }

    @Override
    void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }
}
