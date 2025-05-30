package javarush_Vad.level_8.lesson_3.task_2;

/*
Гибкое заполнение массива
*/
import java.util.Arrays;

public class L8L3T2 {

    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        //напишите тут ваш код

        Arrays.fill(array, begin, end, value);

    }
}
