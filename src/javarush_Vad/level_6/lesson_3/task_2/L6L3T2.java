package javarush_Vad.level_6.lesson_3.task_2;

import java.util.Scanner;

/*
Минимальное из N чисел
*/

public class L6L3T2 {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        array = new int[N];

        // for (int i = 0; i < N; i++) {
        //    array[i] = console.nextInt();
        // } int min = array[0];
        // for (int i = 1; i < N; i++) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = console.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
