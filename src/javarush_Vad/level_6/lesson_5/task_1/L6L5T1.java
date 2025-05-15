package javarush_Vad.level_6.lesson_5.task_1;

/*
Таблица умножения
*/

public class L6L5T1 {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];   // присваиваем размеры горизонтали и вертикали
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) { //горизонтальные линии
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {  //вертикальные линии
                MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);         //перемножение линий
                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
            }
            System.out.println();
        }
    }
}
