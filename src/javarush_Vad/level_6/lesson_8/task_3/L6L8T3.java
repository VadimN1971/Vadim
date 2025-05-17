package javarush_Vad.level_6.lesson_8.task_3;

import java.util.Arrays;

/*
Сортировка массива
*/

public class L6L8T3 {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        //напишите тут ваш код

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
