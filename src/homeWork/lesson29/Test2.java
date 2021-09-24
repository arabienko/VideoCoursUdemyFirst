package homeWork.lesson29;

import java.util.ArrayList;

public class Test2 {

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
//    void testStudents(ArrayList<Student> al, studentChecks sCh) {
//        for (Student s : al) {
//            if (sCh.test(s)) {
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
//        FindStudentOverGrade fStOverGr = new FindStudentOverGrade();
//        FindStudentUnderGrade fStUnderGr = new FindStudentUnderGrade();
//        FindStudentOverAge fsoa=new FindStudentOverAge();
//        FindStudentUnderAge fsua=new FindStudentUnderAge();
//        FindStudentSex fs=new FindStudentSex();
//        FindMixCondition fmc=new FindMixCondition();
//        
//        
//        
//        
//        stInfo.testStudents(al, fStOverGr);
//        System.out.println("---------------------------------------------------------------------------------");
//        stInfo.testStudents(al, fStUnderGr);
//        System.out.println("---------------------------------------------------------------------------------");
//        stInfo.testStudents(al, fsoa);
//        System.out.println("---------------------------------------------------------------------------------");
//        stInfo.testStudents(al, fsua);
//        System.out.println("---------------------------------------------------------------------------------");
//        stInfo.testStudents(al, fs);
//        System.out.println("---------------------------------------------------------------------------------");
//        stInfo.testStudents(al, fmc);
//        System.out.println("---------------------------------------------------------------------------------");
//        
//
//    }
//
//}
//
//interface studentChecks {
//
//    boolean test(Student s);
//}
//
//class FindStudentOverGrade implements studentChecks {
//
//    @Override
//    public boolean test(Student s) {
//        return s.avgGrade > 8;
//    }
//}
//
//class FindStudentUnderGrade implements studentChecks {
//
//    @Override
//    public boolean test(Student s) {
//        return s.avgGrade < 8;
//    }
//}
//
//class FindStudentOverAge implements studentChecks {
//
//    @Override
//    public boolean test(Student s) {
//        return s.age > 22;
//    }
//}
//
//class FindStudentUnderAge implements studentChecks {
//
//    @Override
//    public boolean test(Student s) {
//        return s.age < 22;
//    }
//}
//
//class FindStudentSex implements studentChecks {
//
//    @Override
//    public boolean test(Student s) {
//        return s.sex == 'f';
//    }
//}
//
//class FindMixCondition implements studentChecks {
//
//    @Override
//    public boolean test(Student s) {
//        return s.avgGrade > 6 && s.age > 20 && s.sex == 'm';
//    }
//}
