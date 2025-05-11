package javarush_Vad.level_6.lesson_1.task_2;

/*
Четные и нечетные ячейки массива
*/

public class L6L1T2 {

    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] strings = new String[5];

    public static void main(String[] args) {


            //if (index % 2 == 0);
            //сгенерировать значения index от 0 до 4
            //присвоить эти значения strings[]
            //отфильтровать четные числа и присвоить им EVEN
            //Java уроки - Массивы #10 | Java для начинающих
            // вывод максимального значения
            //int max = 0;
            //for(int i=0; i<n; i++) {
            //    if (array[i]>max) {
            //        max = array[i];
        }
        int index;
        for (int index = 0; index <= 5; index++) {
        //for (int strings = 0; strings < 5; strings++) {

            if (index % 2 == 0)
                index = strings;
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

