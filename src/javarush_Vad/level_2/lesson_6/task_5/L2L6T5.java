package javarush_Vad.level_2.lesson_6.task_5;
/*
Получение длины строки
 */
public class L2L6T5 {
    public static void main(String[] args) {
        String emptyString = "";
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazoka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }
}
