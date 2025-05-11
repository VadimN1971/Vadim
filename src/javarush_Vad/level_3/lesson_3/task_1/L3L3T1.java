package javarush_Vad.level_3.lesson_3.task_1;

import java.util.Scanner;

/*
Тепло или холодно
 */

    public class L3L3T1 {
        public static void main(String[] args) {
            String cold = "на улице холодно";
            String warm = "на улице тепло";
            Scanner console = new Scanner(System.in);
            int age = console.nextInt();
            if (age < 0)
                System.out.println(cold);
            else
                System.out.println(warm);
        }
}
