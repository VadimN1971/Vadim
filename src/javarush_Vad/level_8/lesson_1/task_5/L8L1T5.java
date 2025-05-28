package javarush_Vad.level_8.lesson_1.task_5;

/*
Бесконечность не предел
*/

public class L8L1T5 {
    public static void main(String[] args) {
        //напишите тут ваш код
        div(0.0, 100.0);
        div(0.0, -100.0);
    }
    public static void div(double a, double b) {

        System.out.println(b / a);
    }
}
