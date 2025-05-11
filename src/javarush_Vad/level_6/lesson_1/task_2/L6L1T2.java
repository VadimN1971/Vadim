package javarush_Vad.level_6.lesson_1.task_2;

/*
Четные и нечетные ячейки массива
*/

public class L6L1T2 {

    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {

        for (int index = 0; index <= 5; index++) {
            int strings;
            for (int i = 0; i <= 5; i++) {
                if (i % 2 == 0) {
                    continue;
                } else if {
                    strings = String EVEN;
                } else {
                    strings = (ODD);
                }


                System.out.print("index = 0");
                System.out.println(" value = " + strings[0]);
                System.out.print("index = 1");
                System.out.println(" value = " + strings[1]);
                System.out.print("index = 2");
                System.out.println(" value = " + strings[2]);
                System.out.print("index = 3");
                System.out.println(" value = " + strings[3]);
                System.out.print("index = 4");
                System.out.println(" value = " + strings[4]);
            }
        }
    }
}


