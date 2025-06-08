package javarush_Vad.level_9.lesson_2.task_1;

/*
Randomizer
*/

public class L9L2T1 {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //напишите тут ваш код
        return (int) (Math.random() * 100);
        //return -1;
    }
}