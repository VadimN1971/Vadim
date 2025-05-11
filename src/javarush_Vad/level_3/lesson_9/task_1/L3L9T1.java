package javarush_Vad.level_3.lesson_9.task_1;

import java.util.Scanner;
/*
Сравним строки
 */
public class L3L9T1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("строки одинаковые");
        } else System.out.println("строки разные");
    }
}
