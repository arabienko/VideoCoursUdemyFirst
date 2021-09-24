package homeWork.Lesson20;

import java.util.*;
import java.util.ArrayList;
//import java.util.Arrays;

public class lesson20 {

    static public ArrayList<String> arrList(String... a) {
        ArrayList<String> arrList = new ArrayList<>();

        // arrList.addAll(Arrays.asList(a));//лист из String элементов добавляет в Arraylist
        for (String s : a) {
            if (!arrList.contains(s)) {
                arrList.add(s);
            }
        }
        Collections.sort(arrList);

        return arrList;
    }

    public static void main(String[] args) {

        ArrayList<String> strArray = arrList("ok", "poka", "viktor", "game", "abc", "ok", "okl");

        System.out.println(strArray.toString());

        lesson20 less20 = new lesson20();

        lesson20.arrList("gin", "fine", "gin", "der", "has", "rive");
        System.out.println(less20.arrList("gin", "fine", "gin", "der", "has", "rive"));
    }
}
