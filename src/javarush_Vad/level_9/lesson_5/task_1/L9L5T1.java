package javarush_Vad.level_9.lesson_5.task_1;

/*
Побитовые операции
*/

public class L9L5T1 {
    public static void main(String[] args) {
        int x = 7;
        //x = x & 25;
        x = x & 5;
        //x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
    }
}
