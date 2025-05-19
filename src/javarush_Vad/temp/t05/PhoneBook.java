package javarush_Vad.temp.t05;

//public class PhoneBook {

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private final HashMap<String, String> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
        System.out.println("Контакт добавлен: " + name + " - " + phone);
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Контакт удален: " + name);
        } else {
            System.out.println("Контакт не найден: " + name);
        }
    }

    public void findContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Найден контакт: " + name + " - " + contacts.get(name));
        } else {
            System.out.println("Контакт не найден: " + name);
        }
    }

    public void showAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Телефонная книга пуста");
            return;
        }

        System.out.println("Все контакты:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Найти контакт");
            System.out.println("4. Показать все контакты");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите число от 1 до 5");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String phone = scanner.nextLine();
                    phoneBook.addContact(name, phone);
                    break;

                case 2:
                    System.out.print("Введите имя для удаления: ");
                    String removeName = scanner.nextLine();
                    phoneBook.removeContact(removeName);
                    break;

                case 3:
                    System.out.print("Введите имя для поиска: ");
                    String searchName = scanner.nextLine();
                    phoneBook.findContact(searchName);
                    break;

                case 4:
                    phoneBook.showAllContacts();
                    break;

                case 5:
                    System.out.println("Выход из программы...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите от 1 до 5");
            }
        }
    }
}


