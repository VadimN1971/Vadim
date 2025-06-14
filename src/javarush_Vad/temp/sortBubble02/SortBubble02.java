package javarush_Vad.temp.sortBubble02;
// Сортировка "пузырьком" - v.02 более оптимальный вариант

import java.util.Arrays;

public class SortBubble02 {
    public static void main(String[] args) {

        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        System.out.println("Несортированный массив \n" + Arrays.toString(mas) + "\nexecution");
        int tmp;
        boolean statusSort = false;
        int c = 0;
        while (!statusSort) {
            c++; //Демонстрация цикла
            statusSort = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    statusSort = false;
                    tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;
                }
            }
            System.out.println(c + " - " + Arrays.toString(mas));
        }
        System.out.println("Отсортированный массив \n" + Arrays.toString(mas));
    }
}
