package javarush_Vad.level_6.lesson_6.task_2;

import java.util.Scanner;

/*
Создаем двумерный массив
*/

public class L6L6T2 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        multiArray = new int[N][];
        for (int i = 0; i < N; i++) {
            int size = scanner.nextInt();
            multiArray[i] = new int[size];
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

