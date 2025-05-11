package javarush_Vad.level_3.lesson_4.task_1;

// введен класс Scanner для работы класса Scanner
import java.util.Scanner;

/*
Школа или институт
 */
public class L3L4T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6)
                System.out.println("Нужно ходить в школу");
        } else
            System.out.println("Пора в институт");
    }
}
