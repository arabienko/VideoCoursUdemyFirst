package homeWork.lesson29;

import java.util.ArrayList;

public class lesson29 {

}

//class Student {
//
//    int age;
//    int course;
//    char sex;
//    double avgGrade;
//    String name;
//
//    Student(String name, int age, int course, char sex, double avgGrade) {
//        this.age = age;
//        this.course = course;
//        this.sex = sex;
//        this.name = name;
//        this.avgGrade = avgGrade;
//    }
//
//}
//
//class studentInfo {
//
//    void printStudent(Student st) {
//        System.out.println("Name student: " + st.name + " gender: " + st.sex + " course: " + st.course + " grade: " + st.avgGrade + " age: " + st.age);
//    }
//
//    void printStudenOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudenUnderGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade < grade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudenOverAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age > age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudenUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudenSex(ArrayList<Student> al, char sex) {
//        for (Student s : al) {
//            if (s.sex == sex) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudenMixCondition(ArrayList<Student> al, double grade, int age, char sex) {
//        for (Student s : al) {
//            if (s.avgGrade > grade && s.age > age && s.sex == sex) {
//                printStudent(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student> al = new ArrayList<>();
//
//        Student student1 = new Student("Ivan", 25, 3, 'm', 8.3);
//        Student student2 = new Student("Maria", 19, 1, 'f', 6.3);
//        Student student3 = new Student("Dima", 30, 5, 'm', 9);
//        Student student4 = new Student("Fedor", 22, 2, 'm', 5.5);
//        Student student5 = new Student("Dina", 18, 2, 'f', 8.5);
//
//        al.add(student1);
//        al.add(student5);
//        al.add(student4);
//        al.add(student3);
//        al.add(student2);
//
//        studentInfo stInfo = new studentInfo();
//        
//        stInfo.printStudenOverGrade(al, 8);
//        System.out.println("---------------------------------------------------------------------------------");
//        
//        stInfo.printStudenUnderGrade(al, 6);
//        System.out.println("---------------------------------------------------------------------------------");
//
//        stInfo.printStudenOverAge(al, 22);
//        System.out.println("---------------------------------------------------------------------------------");
//        
//        stInfo.printStudenUnderAge(al, 20);
//        System.out.println("---------------------------------------------------------------------------------");
//        
//        stInfo.printStudenSex(al, 'f');
//        System.out.println("---------------------------------------------------------------------------------");
//        
//        stInfo.printStudenMixCondition(al, 8, 20, 'm');
//        System.out.println("---------------------------------------------------------------------------------");
//    }
//
//}
