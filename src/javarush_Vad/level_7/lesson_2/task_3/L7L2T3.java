package javarush_Vad.level_7.lesson_2.task_3;

import java.util.Arrays;

/*
Правильный порядок
*/

public class L7L2T3 {

    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }
    public static void reverseArray(int[] array) {

        int[] array2 = Arrays.copyOf(array, array.length);
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            array[i] = array2[j];
        }
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
