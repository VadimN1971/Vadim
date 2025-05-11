package javarush_Vad.level_4.lesson_10.task_2;

import java.util.Scanner;

/*
Стакан наполовину пуст или наполовину полон?
*/

public class L4L10T2 {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        Boolean str = scanner.nextBoolean();
        if (str.equals(true)) {
            System.out.println((int) Math.ceil(glass));
        } else {
            System.out.println((int) Math.floor(glass));
        }
    }
}
