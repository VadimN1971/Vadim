package javarush_Vad.level_6.lesson_7.task_2;

import java.util.Arrays;

/*
Выводим двумерные массивы
*/

public class L6L7T2 {
    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        String str = Arrays.deepToString(strings);
        String a = Arrays.deepToString(ints);
        System.out.println(str);
        System.out.println(a);
    }
}
