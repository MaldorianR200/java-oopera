package entities.person;

import enums.Gender;

public class Person {
    String firstName;
    String lastName;
    Gender gender;
    int height;

    public Person(String firstName, String lastName, Gender gender, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
    }


    // Геттеры
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Gender getGender() { return gender; }
    public int getHeight() { return height; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return height == person.height &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + height + " см)";
    }
}
