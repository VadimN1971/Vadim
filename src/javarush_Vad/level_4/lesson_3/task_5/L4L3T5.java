package javarush_Vad.level_4.lesson_3.task_5;

/*
Незаполненный прямоугольник
*/

public class L4L3T5 {
    public static void main(String[] args) {
        int y = 0;
        while (y < 10) {
            int x = 0;
            while (x < 20) {
                if ((x > 0 && x < 19) && (y > 0 && y < 9)) {
                    System.out.print(" ");
                } else {
                    System.out.print("Б");
                }
                x++;
            }
            System.out.println();
            y++;
        }
    }
}

