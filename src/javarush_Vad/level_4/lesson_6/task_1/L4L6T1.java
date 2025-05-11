package javarush_Vad.level_4.lesson_6.task_1;

/*
Четные числа
*/

public class L4L6T1 {
    public static void main(String[] args) {

        for (int i = 1; i < 15; i++) {

            int x;
            if (i % 2 == 0) {
                continue;
            }
            x = 1+i;

            System.out.println(x);
        }
    }

}

