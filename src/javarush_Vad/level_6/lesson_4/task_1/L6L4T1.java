package javarush_Vad.level_6.lesson_4.task_1;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class L6L4T1 {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++)
            System.out.print(strings[i] + ", ");
    }
}
