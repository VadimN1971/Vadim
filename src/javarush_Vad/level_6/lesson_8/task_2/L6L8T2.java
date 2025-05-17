package javarush_Vad.level_6.lesson_8.task_2;

import java.util.Arrays;

/*
Делим массив
*/

public class L6L8T2 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //напишите тут ваш код

        int a = array.length - array.length / 2;
        result[0] = Arrays.copyOfRange(array, 0, a);
        result[1] = Arrays.copyOfRange(array, a, array.length);

        // **************
        //   if (array.length % 2 != 0) {
        //       int ODD = (array.length % 2) + (array.length / 2);
        //       result[0] = Arrays.copyOfRange(array,0, ODD);
        //       result[1] = Arrays.copyOfRange(array, ODD, array.length);
        //   } else {
        //       int EVEN = array.length / 2;
        //       result[0] = Arrays.copyOfRange(array,0,EVEN);
        //       result[1] = Arrays.copyOfRange(array,EVEN,array.length)
        // }
        // **************

        System.out.println(Arrays.deepToString(result));
    }
}

