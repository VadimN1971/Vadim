package javarush_Vad.level_6.lesson_6.task_3;

/*
Создаем мультимассив
*/

public class L6L6T3 {
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k]);
                    System.out.println();
                }
            }
        }
    }
}

// ********************************************************
//System.out.print(multiArray[0][0][0] + ", ");
//System.out.print(multiArray[0][0][1] + ", ");
//System.out.print(multiArray[0][0][2] + ", ");
//System.out.print(multiArray[0][1][0] + ", ");
//System.out.print(multiArray[1][0][0] + ", ");
//System.out.print(multiArray[1][0][1] + ", ");
//System.out.print(multiArray[2][0][0] + ", ");
//System.out.print(multiArray[2][1][0] + ", ");
//System.out.print(multiArray[2][2][0] + ", ");
//System.out.print(multiArray[2][3][0] + ", ");
//System.out.print(multiArray[2][3][1] + " ");