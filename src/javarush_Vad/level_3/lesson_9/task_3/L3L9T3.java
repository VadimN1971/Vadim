package javarush_Vad.level_3.lesson_9.task_3;

import java.util.Scanner;

/*
Сломанная клавиатура
*/

public class L3L9T3 {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();

        if (secret.equalsIgnoreCase(a))
            System.out.println("доступ разрешен");
        else
            System.out.println("доступ запрещен");
    }
}
