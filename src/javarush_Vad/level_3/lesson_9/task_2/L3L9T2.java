package javarush_Vad.level_3.lesson_9.task_2;

public class L3L9T2 {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "ссылки на строки одинаковые";
        String different = "ссылки на строки разные";

        if (string1 == string2)
            System.out.println(same);
        else
            System.out.println(different);
        if (string2 == string3)
            System.out.println(same);
        else
            System.out.println(different);
        if (string1 == string3)
            System.out.println(same);
        else
            System.out.println(different);
    }
}
