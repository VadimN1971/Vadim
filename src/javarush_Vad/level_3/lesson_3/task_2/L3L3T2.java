package javarush_Vad.level_3.lesson_3.task_2;

// введен класс Scanner для работы класса Scanner
import  java.util.Scanner;
/*
Призывная компания
 */
public class L3L3T2 {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        int age = console.nextInt();
        if (18 <= age & age <= 28)
            System.out.println(name + militaryCommissar);
    }
}
