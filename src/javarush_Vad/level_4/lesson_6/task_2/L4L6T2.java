package javarush_Vad.level_4.lesson_6.task_2;

import java.util.Scanner;

/*
Сумма кратных чисел
*/

public class L4L6T2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
