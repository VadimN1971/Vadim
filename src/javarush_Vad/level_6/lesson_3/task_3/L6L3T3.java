package javarush_Vad.level_6.lesson_3.task_3;

import java.util.Scanner;

/*
Максимальное из N чисел
*/

public class L6L3T3 {
    public static int[] array;

    public static void main(String[] args) throws Exception {

        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
