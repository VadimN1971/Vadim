package javarush_Vad.level_8.lesson_2.task_1;

/* 
Правильные типы
*/
public class L8L2T1 {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value) {
        //напишите тут ваш код
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}
