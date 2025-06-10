package javarush_Vad.level_9.lesson_4.task_3;

import java.util.concurrent.TimeUnit;

/*
Таймер
*/

public class L9L3T3 {

    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }

    public static void main(String[] args) throws InterruptedException {
        setTimer(0, 0, 0, 5, 5);
    }
}
