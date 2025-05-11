package javarush_Vad.level_2.lesson_8.task_2;

import  java.util.Scanner;

/*
Чтение чисел
 */

public class L2L8T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println((a + b + c) / 3);
    }
}
