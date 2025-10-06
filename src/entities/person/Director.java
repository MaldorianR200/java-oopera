package entities.person;

import enums.Gender;


public class Director extends Person {
    protected int numberOfShows;
    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
        this.numberOfShows = 0;
    }

    // Метод для увеличения счётчика
    public void incrementNumberOfShows() {
        this.numberOfShows++;
    }

    // Метод для получения кол-ва
    public int getNumberOfShows() {
        return numberOfShows;
    }

    // Можно добавить метод для вывода информации
    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + firstName + " " + lastName + " (постановок: " + numberOfShows + ")");
    }
}
