package homeWork.lesson19;

public class lesson19 {

    public static String[] abc(String[]... array) {
        int n = 0;
        int length = 0;
        for (String[] array1 : array) {
            length += array1.length;
        }

        String[] arra = new String[length];

        for (String[] arra1 : array) {
            for (String i : arra1) {
                arra[n] = i;
                n++;
            }

        }

        return arra;
    }

    public static void main(String[] args) {
        String[] array = abc(new String[]{"ok", "poka", "java"}, new String[]{"bye", "javac", "single"});

        for (String s : args) {
            for (int i = 0; i < array.length; i++) {
                if (s.equals(array[i])) {
                    array[i] = null;
                }
            }

        }

        for (String a : array) {
            System.out.print(a + " ");

        }
    }

}
