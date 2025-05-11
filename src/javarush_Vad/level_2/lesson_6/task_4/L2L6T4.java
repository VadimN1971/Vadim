package javarush_Vad.level_2.lesson_6.task_4;
/*
С каждым разом огромнее
 */
public class L2L6T4 {
    public static void main(String[] args) {
        String bigAmount = "500";
        String greatAmount = "100000";
        int hugeAmount = Integer.parseInt(greatAmount) + Integer.parseInt(bigAmount);
        System.out.println(hugeAmount);
    }
}
