package javarush_Vad.level_4.lesson_5.task_2;

import java.util.Scanner;

/*
Максимумальное четное чтсло из введенных чисел
*/

public class L4L5T2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (console.hasNextInt())
        {
            int x = console.nextInt();
            if ((x % 2 == 0) && (x > max)) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
