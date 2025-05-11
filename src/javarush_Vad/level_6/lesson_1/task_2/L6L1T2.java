package javarush_Vad.level_6.lesson_1.task_2;

/*
Четные и нечетные ячейки массива
*/

public class L6L1T2 {

    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
                {
                        System.out.print("index = 0");
                        System.out.println(" value = " + strings[0]); //"index = 0 value = EVEN
                        System.out.print("index = 1");
                        System.out.println(" value = " + strings[1]); //"index = 1 value = ODD
                        System.out.print("index = 2");
                        System.out.println(" value = " + strings[2]); //"index = 2 value = EVEN
                        System.out.print("index = 3");
                        System.out.println(" value = " + strings[3]); //"index = 1 value = ODD
                        System.out.print("index = 4");
                        System.out.println(" value = " + strings[4]); //"index = 4 value = EVEN
                }
            }
        }
    }
}


