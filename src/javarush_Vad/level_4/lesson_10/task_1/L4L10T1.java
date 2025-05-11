package javarush_Vad.level_4.lesson_10.task_1;

import java.util.Scanner;

/*
Скорость ветра
*/

public class L4L10T1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double m = console.nextDouble();
        double k = (m * 3.6);
        int h = (int) Math.round(k);
        System.out.println(h);
    }
}
