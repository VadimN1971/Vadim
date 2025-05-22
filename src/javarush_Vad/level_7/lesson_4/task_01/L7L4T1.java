package javarush_Vad.level_7.lesson_4.task_01;

/*
Борьба за доступ
*/
//под слэшами решение для сайта JavaRush
public class L7L4T1 {
    public static void main(String[] args) {
        Person person = new Person("Иван", "Иванов");
        System.out.println("Досье.");
        System.out.println("Имя: " + person.getFirstName());
        System.out.println("Фамилия: " + person.getLastName());
        System.out.println("Полное имя: " + person.getFullName());
    }
}

//public class Person {
class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //protected String getFirstName() {
    //        return firstName;
    public String getFirstName() {
        return firstName;
    }

    //String getLastName() {
    //    return lastName;
    public String getLastName() {
        return lastName;
    }

    //public String getFullName() {
    //        return firstName + " " + lastName;
    public String getFullName() {
        return firstName + " " + lastName;
    }
}