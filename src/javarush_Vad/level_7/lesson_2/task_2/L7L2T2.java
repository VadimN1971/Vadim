package javarush_Vad.level_7.lesson_2.task_2;

/*
Ливерпульская четверка
*/

public class L7L2T2 {

    public static void main(String[] args) {
        String navigator = "Джон";
        String pilot = "Пол";
        String secondPilot = "Джордж";
        String flightEngineer = "Ринго";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
        System.out.println("Четвёрка, которой предстоит покорить космос:");
        System.out.println("Штурман: " + navigator);
        System.out.println("Пилот: " + pilot);
        System.out.println("Второй пилот: " + secondPilot);
        System.out.println("Бортинженер: " + flightEngineer);
    }
}
