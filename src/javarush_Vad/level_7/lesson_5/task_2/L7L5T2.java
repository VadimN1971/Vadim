package javarush_Vad.level_7.lesson_5.task_2;

/*
Города-гиганты
*/

public class L7L5T2 {

    public static String City = "Токио";
    public static double population = 34.5;

    public static void main(String[] args) {
        printCityPopulation("Джакарта", 25.3);
        printCityPopulation("Сеул", 25.2);
        printCityPopulation("Дели", 23.1);
        printCityPopulation("Нью-Йорк", 21.6);
    }

    public static void printCityPopulation(String city, double population) {
        System.out.println("Население города " + city + " составляет " + population + " млн человек.");
        System.out.println("В то время как в самом густонаселенном городе " + L7L5T2.City + " население составляет " + L7L5T2.population + " млн человек.");
    }
}


