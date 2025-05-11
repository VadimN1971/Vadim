package javarush_Vad.level_3.lesson_7.task_1;

import java.util.Scanner;

/*
Ищем максимум
 */

public class L3L7T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int max = numberA > numberB ? numberA : numberB;
        System.out.println(max);
    }
}
