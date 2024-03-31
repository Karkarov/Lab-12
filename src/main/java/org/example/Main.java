package org.example;
public class Main {
    public static void main(String[] args) {
        // Создаем объекты, используя разные конструкторы
        Tester tester1 = new Tester("John", "Doe");//
        Tester tester2 = new Tester("Alice", "Smith", 3);
        Tester tester3 = new Tester("Bob", "Johnson", 5, "Intermediate", 50000.0);

        // Выводим информацию о тестерах
        tester1.printDetails();
        System.out.println();
        tester2.printDetails(false);
        System.out.println(); //
        tester3.printDetails("Details for tester:");
        System.out.println();

        // Вызов статического метода
        Tester.welcomeMessage();
    }
}