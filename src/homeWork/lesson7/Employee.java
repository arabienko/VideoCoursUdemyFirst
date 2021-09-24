package homeWork.lesson7;

public class Employee {

    int id;
    public String name;
    int age;
    private double salary;
    String department;

    public Employee(int id1, String name1, int age1, double salary1, String department1) {

        id = id1;
        name = name1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    Employee(int id2, String name2, int age2) {
        this(id2, name2, age2, 0, null);

    }

    private Employee(double salary3) {
        this(0, null, 0, salary3, null);
    }

    double increasedSalary() {
        salary = salary * 2;
        return salary;
    }

    void showInfo() {
        System.out.println("id " + id);
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("salary " + salary);
        System.out.println("department " + department);
        System.out.println();
    }
    public static void main(String[] args) {
         Employee emp3 = new Employee(2589.35);
        emp3.showInfo();
    }
}

class employeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Tanya", 35, 1255.68, "HR");
        emp1.showInfo();

        Employee emp2 = new Employee(22, "Vasya", 45);
        emp2.showInfo();

       
    }
}
