package javarush_Vad.level_2.lesson_4.task_2;

/*
Последняя цифра
 */

public class L2L4T2 {
    public static void main(String[] args) {
        int number = 546;
        int lastDigit = (number % 10);
        System.out.println(lastDigit);
    }
}
