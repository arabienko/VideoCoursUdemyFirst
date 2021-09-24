
package homeWork.lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emplOne=new Employee(1,"Serhei",45,12.35,"HR");
        Employee emplTwo=new Employee(2,"Yuhen",22,256.2,"TL");
        
        emplOne.increasedSalary();
        emplTwo.increasedSalary();
        
        System.out.println("Salary is increased "+emplOne.name+" = "+emplOne.salary);
        System.out.println("Salary is increased "+emplTwo.name+" = "+emplTwo.salary);
        
    }
 
}
