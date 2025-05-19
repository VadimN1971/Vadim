package javarush_Vad.temp.t01;

import java.util.Arrays;
import java.util.Scanner;


public class Temp01 {

    public static void main(String[] args) {

        //задаем булев трёхмерный массив. На этой парковке есть 3 этажа, на каждом из которых можно поместить 2х5 = 10 машин. По умолчанию все ячейки пусты (false)
        boolean[][][] arr = new boolean[3][2][5];
//приехало две машины и припарковались на нулевом этаже в ячейке [1][0] и [1][3]
        arr[0][1][0] = true;
        arr[0][1][3] = true;

//Выведем массив в консоль
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(" arr[" + i + "][" + j + "][" + k + "] = " + arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}







