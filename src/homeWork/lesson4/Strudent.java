package homeWork.lesson4;

class Student {

    double gradeMath;
    double gradeEconom;
    double gradeLang;
    int yearStudy;
   public String nameStudent;
    String surnameStudent;
    int numberStudent;
    double averrStudent;

    void outputInfo() {
        averrStudent = Math.round((gradeLang + gradeEconom + gradeMath) / 3 * 100.0) / 100.0;
        System.out.println("Name: " + nameStudent + "; Surname: " + surnameStudent + "; average score= " + averrStudent);

    }
}

class StudentTest {

    public static void main(String[] args) {
        Student studentOne = new Student();
        Student studentTwo = new Student();
        Student studentThree = new Student();

        studentOne.nameStudent = "Valera";
        studentOne.surnameStudent = "Valeric";
        studentOne.numberStudent = 123;
        studentOne.gradeEconom = 8.2;
        studentOne.gradeLang = 6.5;
        studentOne.gradeMath = 8.2;

        studentTwo.nameStudent = "Petr";
        studentTwo.surnameStudent = "Petrovich";
        studentTwo.numberStudent = 456;
        studentTwo.gradeEconom = 7.2;
        studentTwo.gradeLang = 5.5;
        studentTwo.gradeMath = 4.8;

        // double averrStudentTwo = Math.round((studentTwo.gradeEconom + studentTwo.gradeLang + studentTwo.gradeMath) / 3 * 100.0) / 100.0;
        studentThree.nameStudent = "Olga";
        studentThree.surnameStudent = "Olgich";
        studentThree.numberStudent = 789;
        studentThree.gradeEconom = 7;
        studentThree.gradeLang = 9.5;
        studentThree.gradeMath = 8.7;

        studentOne.outputInfo();
        studentTwo.outputInfo();
        studentThree.outputInfo();

        // double averrStudentThree = Math.round((studentThree.gradeEconom + studentThree.gradeLang + studentThree.gradeMath) / 3 * 100.0) / 100.0;
        //System.out.println("1. Name: " + studentOne.nameStudent + "; Surname: " + studentOne.surnameStudent + "; average score= " + averrStudentOne);
        //System.out.println("2. Name: " + studentTwo.nameStudent + "; Surname: " + studentTwo.surnameStudent + "; average score= " + averrStudentTwo);
        // System.out.println("3. Name: " + studentThree.nameStudent + "; Surname: " + studentThree.surnameStudent + "; average score= " + averrStudentThree);
    }

}
