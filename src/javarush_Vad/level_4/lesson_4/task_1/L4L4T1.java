package javarush_Vad.level_4.lesson_4.task_1;

import java.util.Scanner;

/*
Показываем, что получаем
*/

public class L4L4T1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            String s = console.nextLine();
            if (s.equals("enough")) {
                break;
            }
            System.out.println(s);
        }

    }
}

