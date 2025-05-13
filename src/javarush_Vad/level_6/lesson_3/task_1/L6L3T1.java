package javarush_Vad.level_6.lesson_3.task_1;

import java.util.Scanner;

/*
Reverse
*/

public class L6L3T1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int N = console.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = console.nextInt();
        }
        if (N % 2 == 0) {
            for (int i = N - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int j = 0; j < N; j++) {
                System.out.println(array[j]);
            }
        }
    }
}






