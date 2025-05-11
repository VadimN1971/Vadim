package javarush_Vad.level_2.lesson_6.task_3;
/*
Конкатенция строк и чисел
 */
public class L2L6T3 {
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int z = 0;
        String digits = x + y + "" + z;
        System.out.println(digits);
    }
}
