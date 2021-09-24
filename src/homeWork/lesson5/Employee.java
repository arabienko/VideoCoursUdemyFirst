package homeWork.lesson5;

public class Employee {

    int id;
    String name;
    int age;
    double salary;
    String department;

    Employee(int id1, String name1, int age1, double salary1, String department1) {

        id = id1;
        name = name1;
        age = age1;
        salary = salary1;
        department = department1;
    }
    
    double increasedSalary(){
        salary=salary*2;
        return salary;
    }

}
