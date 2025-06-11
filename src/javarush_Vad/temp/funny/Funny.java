package javarush_Vad.temp.funny;

import java.util.Scanner;

public class Funny {

    public static String ups = "да";
    public static String ops = "нет";

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("О прекрасная девица! Давайте займемся сексом?! )) \n Ответьте же скорее: Да или нет?");
        String name = console.nextLine();
        if (ups.equalsIgnoreCase(name))
            System.out.println("УРА!!! В койку!!!");
        else if (ops.equalsIgnoreCase(name)) {
            System.out.println("Если девушка говорит нет, \n то она подразумевает ДА!!!");
        } else System.out.println("Ответьте на вопрос точно: ДА или НЕТ! \n Для повторной попытки нажмите клавиши Ctrl+F10");
    }
}
