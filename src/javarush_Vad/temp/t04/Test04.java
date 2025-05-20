package javarush_Vad.temp.t04;

public class Test04 {


    public static void main(String[] args) {
        user2(); //в методе main обязательна передача работе программе следующему методу!
    }

    public static void user1() {
        System.out.println("user1");
        user3(); //метод не запустится, так как user2 от main никакому другому методу не был передан.
        user1(); //А метод 3 тоже никем не был запущен, так как за границей метода user2 и там остановился без передачи дальше.
    }

    public static void user2() {
        System.out.println("user2");
    }

    public static void user3() {
        System.out.println("user3");
        //user2();
        //user1();
    }
}
