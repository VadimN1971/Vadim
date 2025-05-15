package javarush_Vad.temp.t04;

/*
Таблица умножения > умножение
*/

public class Test04 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int x = i * j;
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// В цикле выложить столбец из таблицы умножения
// Сгенерировать числа X и Y в цикле от 1 до 10, после чего их перемножить выводя в ответ результат.
// Для начала, перемножить от 1 до 10 на одно число.

