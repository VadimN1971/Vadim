package javarush_Vad.level_6.lesson_8.task_1;

import java.util.Arrays;

/*
Заполняем массив
*/

public class L6L8T1 {
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {

        int a = array.length - array.length / 2;
        Arrays.fill(array, 0, a, valueStart);
        Arrays.fill(array, a, array.length, valueEnd);

        System.out.println(Arrays.toString(array));
    }
}
