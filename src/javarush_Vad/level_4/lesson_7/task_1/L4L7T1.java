package javarush_Vad.level_4.lesson_7.task_1;

/*
Рисуем треугольник
*/

public class L4L7T1 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++)
        {
            int starCount = 0 + i;
            for (int j = 0; j < starCount; j++)
                System.out.print("8");
            System.out.println();
        }
    }

}
