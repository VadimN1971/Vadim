package javarush_Vad.level_4.lesson_3.task_2;

import java.util.Scanner;

/*
Все любят Мамбу
*/

public class L4L3T2 {

    public static void main(String[] args) {
        String text = " любит меня.";

        Scanner console = new Scanner(System.in);
        String a = console.nextLine();

        int  n = 0;
        while (n < 10)
        {
            System.out.println(a + text);
            n++;
        }
    }
    }
