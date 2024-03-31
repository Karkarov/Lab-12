package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Перегруженные конструкторы
    public Tester(String name, String surname) {
        this(name, surname, 0, "None", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "None", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    // Перегруженные методы
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Experience in years: " + experienceInYears);
        System.out.println("English Level: " + englishLevel);
        System.out.println("Salary: $" + salary);
    }

    public void printDetails(boolean showSalary) {
        printDetails();
        if (!showSalary) {
            System.out.println("Salary information is not available.");
        }
    }

    public void printDetails(String message) {
        System.out.println(message);
        printDetails();
    }

    // Статический метод
    public static void welcomeMessage() {
        System.out.println("Welcome to the Tester class!");
    }
}
