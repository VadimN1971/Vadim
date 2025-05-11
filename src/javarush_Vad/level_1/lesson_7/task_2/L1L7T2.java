package javarush_Vad.level_1.lesson_7.task_2;

/*
Комментарии излишни
*/

public class L1L7T2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        //y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
