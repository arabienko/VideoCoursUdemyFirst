package homeWork.lesson18;

public class lesson18 {

    static public int[] sortirovka(int arr[]) {
        int arrChang;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            if (i != index) {
                arrChang = arr[i];
                arr[i] = min;
                arr[index] = arrChang;

            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arrInt = {1, 5, 6, 15, 7, -2, 0};

        sortirovka(arrInt);

        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i] + ", ");
        }
    }
}
