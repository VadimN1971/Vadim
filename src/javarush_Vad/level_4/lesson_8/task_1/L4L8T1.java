package javarush_Vad.level_4.lesson_8.task_1;

import java.util.Scanner;

/*
Хорошего не бывает много
*/
public class L4L8T1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int s = console.nextInt();

        do {
            System.out.println(str);
            s--;
        }
        while (s > 0 && s < 4);
    }
}



