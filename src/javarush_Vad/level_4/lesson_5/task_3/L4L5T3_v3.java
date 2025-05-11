package javarush_Vad.level_4.lesson_5.task_3;

import java.util.Scanner;

/*
Второе минимальное число из введенных
Это правильное решение из javarush
*/

public class L4L5T3_v3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int tmp = console.nextInt();
            if (tmp < min) {
                secondMin = min;
                min = tmp;
            } else if (tmp > min && tmp < secondMin) {
                secondMin = tmp;
            }
        }
        System.out.println(secondMin);
    }
}
