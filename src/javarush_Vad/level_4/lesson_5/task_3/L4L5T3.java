package javarush_Vad.level_4.lesson_5.task_3;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class L4L5T3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE; // вводим первое число
        int secondMin = console.nextInt(); // вводим второе число

        while (console.hasNextInt()) { // Создаем цикл. Работает до тех пор, пока есть числа для ввода
            int x = console.nextInt(); // вводим следующее значение

            if(min == secondMin) { // если первые два значения были одинаковые, то идет сравнение
                if(x < min) { // если введенное значение меньше, то оно становится минимальным
                    min = x;
                } else { // в ином случае оно будет вторым по величине
                    secondMin = x;
                }
            } else if (x < min) { // если введенное значение меньше минимального, то оно его заменяет и предыдущее минимальное становится вторым по величине
                secondMin = min;
                min = x;
            } else if (x > min && x < secondMin) { // тут проверка, что введенное значение больше чем минимальное, но меньше второго по величине - тогда оно становится вторым по величине
                secondMin = x;
            }
        }
        System.out.println(secondMin);
    }
}
