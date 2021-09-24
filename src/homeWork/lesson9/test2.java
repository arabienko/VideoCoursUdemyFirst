
package homeWork.lesson9;

public class test2 {
 int a=5;
static int b=110;   
 void showtest(int a){
    System.out.println(a);
    System.out.println(test2.b);
     System.out.println(this.a);
}
    public static void main(String[] args) {
        test2 t2=new test2();
        t2.showtest(4);
    }
}
