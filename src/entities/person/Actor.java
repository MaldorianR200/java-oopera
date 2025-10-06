package entities.person;

import enums.Gender;

public class Actor extends Person {
    int height;
    public Actor(String name, String superName, Gender gender, int height) {
        super(name, superName, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
