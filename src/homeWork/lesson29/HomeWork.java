package homeWork.lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class HomeWork {

}

class Employee {

    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }
}

class TestEmployee {

    public void printEmployee(Employee emp) {
        System.out.println("Name: " + emp.name + "; Department: " + emp.department + "; Salary: " + emp.salary + ".");
    }

    public void filtraciyaRabotnikov(ArrayList<Employee> arrList, Predicate<Employee> t) {
        for (Employee s : arrList) {
            if (t.test(s)) {
                printEmployee(s);
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Igor", "Marketing", 125.5);
        Employee emp2 = new Employee("Miha", "IT", 250.5);
        Employee emp3 = new Employee("Egor", "IT", 200);
        Employee emp4 = new Employee("Karim", "Karim", 300);
        Employee emp5 = new Employee("Tanya", "TeamLead", 800.25);

        ArrayList<Employee> arrList;
        arrList = new ArrayList<>();
        arrList.add(emp1);
        arrList.add(emp2);
        arrList.add(emp3);
        arrList.add(emp4);
        arrList.add(emp5);

        TestEmployee tEmp = new TestEmployee();

        tEmp.filtraciyaRabotnikov(arrList, (Employee t) -> {
            return ("IT".equals(t.department) && t.salary > 200);
        });
        System.out.println("---------------------------------------------------------------------------------");

        tEmp.filtraciyaRabotnikov(arrList, (Employee t) -> {
            return t.name.startsWith("E") && t.salary != 450;
        });
        System.out.println("---------------------------------------------------------------------------------");
        
        tEmp.filtraciyaRabotnikov(arrList, t -> {return t.name.equals(t.department);
        });
    }
}
