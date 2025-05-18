package javarush_Vad.level_6.lesson_8.task_4;

import java.util.Arrays;

/*
Есть ли кто?
*/

public class L6L8T4 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишите тут ваш код

        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

            int x = Arrays.binarySearch(sortedArray, element);
            boolean b = x >= 0;
            System.out.println(b);
        }
    }
