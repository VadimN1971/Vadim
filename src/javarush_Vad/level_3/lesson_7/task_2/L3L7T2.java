package javarush_Vad.level_3.lesson_7.task_2;

import java.util.Scanner;

/*
Через терни...
 */

public class L3L7T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 5) {
            System.out.println("число больше 5");
        } else if (number < 5) {
            System.out.println("число меньше 5");
        } else if (number == 5) {
            System.out.println("число равно 5");
        }
    }
}
