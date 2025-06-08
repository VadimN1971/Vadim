package javarush_Vad.level_9.lesson_2.task_2;

/*
Magic 8 ball
*/

import java.util.Random;

class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        //напишите тут ваш код
        Random r = new Random();
        int x = r.nextInt(8);
        String answer = null;
        if (x == 0) {
            answer = CERTAIN;
        } else if (x == 1) {
            answer = DEFINITELY;
        } else if (x == 2) {
            answer = MOST_LIKELY;
        } else if (x == 3) {
            answer = OUTLOOK_GOOD;
        } else if (x == 4) {
            answer = ASK_AGAIN_LATER;
        } else if (x == 5) {
            answer = TRY_AGAIN;
        } else if (x == 6) {
            answer = NO;
        } else if (x == 7) {
            answer = VERY_DOUBTFUL;
        } else {
            answer = null;
        }
        return answer;
    }
}

public class L9L2T2 {
    public static void main(String[] args) {
        System.out.println("Заработаю ли я себе на BMW?");
        System.out.println(MagicBall.getPrediction());
    }
}

