package javarush_Vad.temp.t04;

public class Test04 {


    public static void main(String[] args) {
        user1(); //в методе main обязательна передача работе программе следующему методу!
    }

    public static void user1() {
        user3();
        System.out.println("user1");
        user2();
        System.out.println("user1-2");
        user2();
    }

    public static void user2() {
        System.out.println("user2");
    }

    public static void user3() {
        user2();
        System.out.println("user3");
        user4();
    }

    public static void user4() {
        System.out.println("user4");

    }
}
// Метод mine посредством метода user1() передает исполнение кода дальше
// к методу public static void user1() и затем исполняет указание, перейти к user3().
// Далее, метод public static void user3() и затем исполняет указание, перейти к user2().
// Далее, метод public static void user2() выполняет System.out.println("user2")
// и передает его дальше, методу public static void user3().
// Но, так как в этом методе уже исполнен метод user2(),
// исполнение передается дальше к System.out.println("user3");, а затем к методу user4().
// Далее, выполняется метод public static void user4(),
// затем происходит возврат к методу public static void user1().
// Но, так как в этом методе уже исполнен метод user3(),
// исполнение передается дальше к System.out.println("user1");, а затем к методу user2().
// Далее, метод public static void user2() выполняет System.out.println("user2").
// и передает его дальше, методу public static void user3().
// Но, так как в этом методе уже исполнен метод user2() и System.out.println("user3");,
// исполнение передается дальше к методу user4().
// Далее, выполняется метод public static void user4(),
// затем происходит возврат к методу public static void user1().
// Но, так как в этом методе уже исполнен методы user3() и System.out.println("user1"); и user2();,
// исполнение передается дальше к методу System.out.println("user1-2"); и user2();
// Далее, метод public static void user2() выполняет System.out.println("user2")
// и завершается работа кода, так как далее исполнение кода никуда не передается.






