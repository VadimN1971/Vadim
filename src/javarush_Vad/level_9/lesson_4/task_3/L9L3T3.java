package javarush_Vad.level_9.lesson_4.task_3;

/*
Обратный отсчет
*/

public class L9L3T3 {
    public static void main(String[] args) throws InterruptedException {
        countDown();
    }

    public static void countDown() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Старт!");
    }
}
