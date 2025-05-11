package javarush_Vad.level_3.lesson_7.task_3;

import java.util.Scanner;

/*
Высокая точность
 */
public class L3L7T3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // дробные числа вводятся через запятую, а не точку. Проблемы локации программы.
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (Math.abs(b - a) < 0.000001) {
            System.out.println("числа равны");
        } else {
            System.out.println("числа не равны");
        }
    }
}
