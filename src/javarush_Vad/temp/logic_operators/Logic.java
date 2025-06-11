package javarush_Vad.temp.logic_operators;

public class Logic {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int x = 3;
        System.out.print(a < x ^ x > b);
        // && - AND - И - коньюкция (conjunction)
        // || - OR - ИЛИ - дизъюнкция (disjunction)
        // System.out.print(a < x < b);//Ошибка компиляции
    }
}
