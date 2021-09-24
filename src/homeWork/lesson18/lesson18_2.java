package homeWork.lesson18;

public class lesson18_2 {
    static public void showArray(String str[][]){
        System.out.print("{");
     for (int i = 0; i < str.length; i++) {
         System.out.print("{");
            for(int j = 0; j < str.length; j++) {
                if(j!=str.length-1){
                System.out.print(str[i][j]+", ");
                }else {System.out.print(str[i][j]);}
                }
            if(i!=str.length-1){
                System.out.print("}, ");
            }else {System.out.print("}");
                    }
        }
      System.out.print("}");
    }
    
    public static void main(String[] args) {
        
        String[]str1={"a","b","c","d"};
        String[]str2={"hi","no","yes"};
        String[]str3={"back","into","wind","rain","gol"};
        String [][]strTwo={str1,str2,str3};
        
        showArray(strTwo);
        System.out.println();
        showArray(new String[][]{{"hi","hello","hey"},{"no","please","hate me","bark me"},{"mew","blanck","char","trade"}});
    }
}
