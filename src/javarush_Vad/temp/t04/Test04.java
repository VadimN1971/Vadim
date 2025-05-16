package javarush_Vad.temp.t04;

import java.util.Scanner;
/*
Таблица умножения > умножение
*/

public class Test04 {
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
