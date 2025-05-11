package javarush_Vad.level_2.lesson_8.task_1;

import java.util.Scanner;

/*
Чтение и преобразование строк
 */

public class L2L8T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String s = scanner.nextLine();
        String p = scanner.nextLine();
        System.out.println(p);
        System.out.println(s.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}
