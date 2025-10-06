package entities.show;

import entities.person.Director;

public class Opera extends MusicalShow {
    String choirSize;
    public Opera(String title, int duration, Director director,
                 String musicAuthor, String librettoText, String choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;


    }
}
