package homeWork.lesson22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public void setName(StringBuilder n) {
        if (n.length() > 3) {
            this.name = n;
        }
    }

    public void setCourse(int c) {
        if ((c > 0) && (c < 5)) {
            this.course = c;
        }
    }

    public void setGrade(int g) {
        if (g > 0 && g < 11) {
            this.grade = g;
        }
    }
    
    public StringBuilder getName (StringBuilder name){
    return name;
    }
    
    public int getCourse (int course){
    return course;
    }
    
    public int getGrade(int grade){
    return grade;
    }
    
    public void showInfo(){
        System.out.println("Name: "+name);
        System.out.println("Grade: "+grade);
        System.out.println("Course: "+course);
    }

}
 class TestStudent{
     public static void main(String[] args) {
         Student student=new Student();
         student.setCourse(3);
         student.setGrade(8);
         student.setName(new StringBuilder ("Abraham"));
         
         student.showInfo();
     }
 }