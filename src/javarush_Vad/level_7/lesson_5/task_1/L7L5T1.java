package javarush_Vad.level_7.lesson_5.task_1;

/*
У всего есть корень
*/

public class L7L5T1 {

    public static void main(String[] args) {
        int[] array = {15,64,9,51,42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrt + element + " равен " + elementSqrt);
        }
    }
}
