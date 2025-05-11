package javarush_Vad.level_4.lesson_5.task_3;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class L4L5T3_v2 {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int min1 = Integer.MAX_VALUE;
        int min2 = console.nextInt();
        while (console.hasNextInt()) {
            int number = console.nextInt();
            if (number < min1) {
                min2 = min1;
                min1 = number;
            } else if (min1 < number && number < min2) min2 = number;
            else ;
        }
        System.out.println(min2);
    }
}
