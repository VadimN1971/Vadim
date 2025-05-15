package javarush_Vad.level_6.lesson_5.task_1;

/*
Таблица умножения
*/

import java.util.Scanner;

public class L6L5T1 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
//


        MULTIPLICATION_TABLE = new int[10][10];

        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
//
                //int[][] tables = {{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}};
                //for (int x = 0; x < 10; x++) {  //идём по строкам
                //    for (int y = 0; y < 10; y++) {//идём по столбцам
                //MULTIPLICATION_TABLE[i][j] = MULTIPLICATION_TABLE.length[i][j] * MULTIPLICATION_TABLE.length[i][j];
//

             //   MULTIPLICATION_TABLE[i][j] = ((int i = 0; i < 10; i++)  (int j = 0; j < 10; j++));
                //MULTIPLICATION_TABLE[i][j] = i * j;

                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//int[][] tables = {{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}};
//int[][] tables = new int MULTIPLICATION_TABLE;
//for (int i=0; i<10; i++)
//    for (int j=0; j<10; j++)
//            tables[i][j] = MULTIPLICATION_TABLE[i][j] * MULTIPLICATION_TABLE[i][j];

//for (int i = 0; i < tables.length; i++) {
//    for (int j = 0; j < tables.length; j++) {
//       System.out.print(" " + MULTIPLICATION_TABLE[i][j]);
//    }
//    System.out.println();
//}



