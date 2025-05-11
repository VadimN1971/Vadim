package javarush_Vad.level_3.lesson_6.task_2;

import java.util.Scanner;

/*
Работать или не работать - вот в чем вопрос
 */

public class L3L6T2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = console.nextInt();

        boolean isYoung = (age < 20);
        boolean isOld = (age > 60);
        if (isYoung || isOld)
            System.out.println("можно не работать");
    }
}
