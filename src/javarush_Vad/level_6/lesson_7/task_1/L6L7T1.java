package javarush_Vad.level_6.lesson_7.task_1;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/*
Выводим массивы
*/

public class L6L7T1 {
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String str = Arrays.toString(strings);
        String a = Arrays.toString(ints);
        System.out.println(str);
        System.out.println(a);
    }
}
