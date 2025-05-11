package javarush_Vad.level_3.lesson_5.task_2;

// введен класс Scanner для работы класса Scanner

import java.util.Scanner;

/*
Три числа
 */

public class L3L5T2 {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String str = " ";
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean abc = (a == b && b == c);
        boolean ab = a == b;
        boolean ac = a == c;
        boolean bc = b == c;

        if (abc) {
            System.out.println(a + str + b + str + c);
        } else if (ab) {
            System.out.println(a + str + b);
        } else if (ac) {
            System.out.println(a + str + c);
        } else if (bc) {
            System.out.println(b + str + c);
        }
    }
}
