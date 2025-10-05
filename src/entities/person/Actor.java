package entities.person;

import enums.Gender;

public class Actor extends Person {
    String numberOfShows;

    public Actor(String name, String superName, Gender gender, int height,  String numberOfShows) {
        super(name, superName, gender, height);
        this.numberOfShows = numberOfShows;
    }

    public String getNumberOfShows() { return numberOfShows; }
}
