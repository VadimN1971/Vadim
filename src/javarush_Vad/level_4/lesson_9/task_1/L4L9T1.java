package javarush_Vad.level_4.lesson_9.task_1;

import java.util.Scanner;

/*
Площадь круга
*/

public class L4L9T1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double radius = console.nextDouble();
        double pi = 3.14;
        double S = (radius * radius * pi);
        int x = (int) (S);
        System.out.println(x);
    }

}
