package entities.show;

import entities.person.Actor;
import entities.person.Director;

import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> actors;
    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        actors = new ArrayList<>();

        // Автоматически увеличиваем счётчик постановок
        if (director != null) {
            director.incrementNumberOfShows();
        }
    }

    // Метод для вывода списка актёров
    public void printActors() {
        System.out.println("Актёры в спектакле '" + title + "':");
        for (Actor actor : actors) {
            System.out.println(" - " + actor.getFirstName() + " " + actor.getLastName() +
                    " (" + actor.getHeight() + " см)");
        }
    }

    // Метод для добавления актёра
    public boolean addActor(Actor newActor) {
        for (Actor actor : actors) {
            if (actor.equals(newActor)) {
                System.out.println("⚠️  Предупреждение: Актёр " + newActor.getFirstName() + " " +
                        newActor.getLastName() + " уже участвует в спектакле!");
                return false;
            }
        }
        actors.add(newActor);
        System.out.println("✅ Актёр " + newActor.getFirstName() + " " + newActor.getLastName() +
                " добавлен в спектакль '" + title + "'");
        return true;
    }

    // Метод для замены актёра
    public boolean replaceActor(Actor newActor, String lastNameToReplace) {
        for (int i = 0; i < actors.size(); i++) {
            if (actors.get(i).getLastName().equals(lastNameToReplace)) {
                actors.set(i, newActor);
                System.out.println("✅ Актёр " + lastNameToReplace + " заменён на " +
                        newActor.getFirstName() + " " + newActor.getLastName());
                return true;
            }
        }
        System.out.println("⚠️  Предупреждение: Актёр с фамилией '" + lastNameToReplace +
                "' не найден в спектакле!");
        return false;
    }

    // Геттеры
    public String getTitle() { return title; }
    public ArrayList<Actor> getActors() { return actors; }
    public Director getDirector() { return director; }
}
