package javarush_Vad.temp.t03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp03_1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем две кнопки и определяем действия по нажатию
        JButton button1 = new JButton("Кнопка 1");
        JButton button2 = new JButton("Кнопка 2");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата кнопка 1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Нажата кнопка 2");
            }
        });

        // Добавляем кнопки на панель содержимого
        frame.getContentPane().add(BorderLayout.NORTH, button1);
        frame.getContentPane().add(BorderLayout.SOUTH, button2);

        // Устанавливаем размер и отображаем окно
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}


