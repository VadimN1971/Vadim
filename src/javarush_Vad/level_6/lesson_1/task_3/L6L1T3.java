package javarush_Vad.level_6.lesson_1.task_3;

/*
Работаем с элементами массива
*/

public class L6L1T3 {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {

        int even = array[0];
        int index = 0;


        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                even = i;
            }
            array[] = (-Math.abs(i));
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        break;
    }

}
