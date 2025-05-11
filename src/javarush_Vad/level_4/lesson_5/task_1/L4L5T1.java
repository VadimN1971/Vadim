package javarush_Vad.level_4.lesson_5.task_1;

import java.util.Scanner;

/*
Минимум из введенных чисел
*/

public class L4L5T1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < max)
                max = x;
        }
        System.out.println(max);
    }
}
