package entities.show;

import entities.person.Director;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Метод для печати либретто
    public void printLibrettoText() {
        System.out.println("Либретто спектакля '" + title + "':");
        System.out.println(librettoText);
        System.out.println("Автор музыки: " + musicAuthor);
    }


}
