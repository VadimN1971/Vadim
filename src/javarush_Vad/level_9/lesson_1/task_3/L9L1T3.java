package javarush_Vad.level_9.lesson_1.task_3;

import java.util.Scanner;

/*
Минимальный элемент массива
*/

public class L9L1T3 {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int element : array) {
            min = Math.min(min, element);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner console = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
        }
        return array;
    }
}
