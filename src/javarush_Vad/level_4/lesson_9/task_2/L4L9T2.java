package javarush_Vad.level_4.lesson_9.task_2;

import java.util.Scanner;

/*
Share a Coke
*/

public class L4L9T2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double j = console.nextDouble();
        double p = console.nextDouble();
        double x = j / p;
        System.out.println(x);
    }
}
