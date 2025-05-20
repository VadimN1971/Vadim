package javarush_Vad.level_7.lesson_3.task_03;

/*
Кубический калькулятор в кубе
*/

public class L7L3T3 {
    public static void main(String[] args) {
    }

    public static long cube(long number) {
        return number * number * number;
    }

    public static long ninthDegree(long number) {
        return cube(cube(number));
    }
}


