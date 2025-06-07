package javarush_Vad.level_9.lesson_1.task_2;

public class L9L1T2 {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
        if (power == 0) {
            //return 1;
            return Math.pow(number, power);
        }

        int modulus = power < 0 ? power * -1 : power;
        int result = number;
        for (int i = 1; i < modulus; i++) {
            result *= number;
        }
        return power < 0 ? 1.0 / result : result;
    }
}
