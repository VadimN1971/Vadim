package javarush_Vad.level_3.lesson_6.task_1;

import java.util.Scanner;

/*
Треугольник
 */

public class L3L6T1 {
    private static final String TRIANGLE_EXISTS = "Треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "Треугольник не существует";

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if ((c < (a + b)) && (b < (a + c)) && (a < (b + c))) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
