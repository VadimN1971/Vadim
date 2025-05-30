package javarush_Vad.level_8.lesson_3.task_1;

/*
Массив значений
*/

import java.util.Arrays;

public class L8L3T1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value) {
        //напишите тут ваш код
        Arrays.fill(array, value);
    }
}
