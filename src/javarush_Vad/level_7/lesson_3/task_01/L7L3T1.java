package javarush_Vad.level_7.lesson_3.task_01;

/*
Добро пожаловать! Но не всем.
*/

import javax.swing.*;
import java.util.Scanner;

public class L7L3T1 {
    public static void main(String[] args) {
    }

    public static void signIn(String username) {
        //напишите тут ваш код
        if (username.equals("user")) {
            return;
        }
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
