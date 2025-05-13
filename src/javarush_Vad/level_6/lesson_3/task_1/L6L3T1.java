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
            System.out.println(i + "in");
        }

        // добавить еще один вывод на дисплей цифр в прямом порядке, если число четное с определением четности (if / else)
        if (N % 2 == 0) {

            for (int i = N - 1; i >= 0; i--) {
                System.out.println(array[i] + "out revers (N-EVEN)");
            }
        } else {

            for (int j = 0; j < N; j++) {
                System.out.println(array[j] + "out direct (N-ODD)");
            }

            //(N % 2 != 0) {

            //for (int i = 0; i >= N; i++) {
            //    System.out.println(array[i]);
            //}

            //for (int i = 0; i <= N; i++) {
            //        System.out.println(i);
            //}
//*
            //if (N % 2 == 0) {
            //    System.out.println(N + "==N");
// *
            //int x = N > 0 ? 1 : 0;
            //System.out.println(x + "on-1/off-0"); // если N > 0, то x = 1.

            //if (array[N] % 2 == 0) {

            //int[] a = new int[N];
            //int a = console.nextInt();
        }
    }
}






