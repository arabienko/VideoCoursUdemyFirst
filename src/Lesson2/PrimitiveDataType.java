package Lesson2;

public class PrimitiveDataType {
    

    public static void main(String[] args) {
        char c6 = '\u0500';// в десятиричной системеэ - символ в unicode
        char c6_1=1280;//десятиричная
        System.out.println(c6+" "+c6_1);
        int i1 = 60;
        int i2 = 0b111100;//0b - двоичная система написания 
        System.out.println(i2);

        int i3 = 074;//0 - восьмеричная
        int i3_1=0_74;
        System.out.println(i3+" "+i3_1);

        int i4 = 0x3c;//0x - десятиричная
        System.out.println(i4);

        int i5 = 1_000_000_000;
        System.out.println(i5);
    }
}
