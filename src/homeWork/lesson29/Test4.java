package homeWork.lesson29;

import java.util.ArrayList;
import java.util.function.*;

public class Test4 {

}

class Student {

    int age;
    int course;
    char sex;
    double avgGrade;
    String name;

    Student(String name, int age, int course, char sex, double avgGrade) {
        this.age = age;
        this.course = course;
        this.sex = sex;
        this.name = name;
        this.avgGrade = avgGrade;
    }

}

class studentInfo {

    void printStudent(Student st) {
        System.out.println("Name student: " + st.name + " gender: " + st.sex + " course: " + st.course + " grade: " + st.avgGrade + " age: " + st.age);
    }

    void testStudents(ArrayList<Student> al, Predicate<Student> t) {
        for (Student s : al) {
            if (t.test(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<>();

        Student student1 = new Student("Ivan", 25, 3, 'm', 8.3);
        Student student2 = new Student("Maria", 19, 1, 'f', 6.3);
        Student student3 = new Student("Dima", 30, 5, 'm', 9);
        Student student4 = new Student("Fedor", 22, 2, 'm', 5.5);
        Student student5 = new Student("Dina", 18, 2, 'f', 8.5);

        al.add(student1);
        al.add(student5);
        al.add(student4);
        al.add(student3);
        al.add(student2);

        studentInfo stInfo = new studentInfo();

        stInfo.testStudents(al, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("---------------------------------------------------------------------------------");
        stInfo.testStudents(al, (Student s) -> {
            return s.avgGrade < 8;
        });
        System.out.println("---------------------------------------------------------------------------------");
        stInfo.testStudents(al, s -> s.age > 22);
        System.out.println("---------------------------------------------------------------------------------");
        stInfo.testStudents(al, s -> {
            return s.age < 22;
        });
        System.out.println("---------------------------------------------------------------------------------");
        stInfo.testStudents(al, (Student s) -> {
            int z = 5;
            return s.sex == 'f';
        });
        System.out.println("---------------------------------------------------------------------------------");
        stInfo.testStudents(al, (Student s) -> {
            return s.avgGrade > 6 && s.age > 22 && s.sex == 'm';
        });
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");

        for (Student s : al) {
            System.out.println(s.name);
        }
        System.out.println("---------------------------------------------------------------------------------");

        al.removeIf(x -> x.name.endsWith("a"));
        for (Student s : al) {
            System.out.println(s.name);
        } 
    }

}
