package javarush_Vad.level_3.lesson_5.task_1;

// введен класс Scanner для работы класса Scanner
import java.util.Scanner;

/*
Измеряем температуру тела
 */

public class L3L5T1 {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        isHigh = (bodyTemperature > 37);
        isLow = (bodyTemperature < 36);
        if (isHigh) {
            System.out.println("Температура тела высокая");
        } else if (isLow) {
            System.out.println("Температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
