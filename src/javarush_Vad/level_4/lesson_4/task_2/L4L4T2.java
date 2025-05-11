package javarush_Vad.level_4.lesson_4.task_2;

/*
Сумма чисел от 1 до 100 не кратных 3
*/
public class L4L4T2 {
    public static void main(String[] args) {

        int i = 0;
        int out = 0;
        while (i < 101) {
            if ((i % 3) == 0) {
                i++;
                continue;
            }
            out += i;
//            System.out.println(i); // Вывод отфильтрованных чисел
            i++;
        }
        System.out.println(out);
    }
}
