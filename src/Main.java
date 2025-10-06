import entities.person.Actor;
import entities.person.Director;
import entities.show.Ballet;
import entities.show.Opera;
import entities.show.Show;
import enums.Gender;

public class Main {

    public static void main(String[] args) {
        System.out.println("🎭 Театр открывается! 🎭\n");

        // Создаём актёров
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 185);
        Actor actor2 = new Actor("Мария", "Сидорова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Алексей", "Иванов", Gender.MALE, 178);

        // Создаём режиссёров
        Director director1 = new Director("Сергей", "Режиссёров", Gender.MALE);
        Director director2 = new Director("Ольга", "Постановкина", Gender.FEMALE);

        // Создаём автора музыки и хореографа
        String musicAuthor = "Пётр Композиторов";
        String choreographer = "Анна Танцова";

        // Создаём спектакли
        Show regularShow = new Show("Обычный спектакль", 120, director1);
        Opera opera = new Opera("Евгений Онегин", 180, director2,
                musicAuthor, "либретто оперы 'Евгений Онегин'...", "30 человек");
        Ballet ballet = new Ballet("Лебединое озеро", 150, director1,
                musicAuthor, "либретто балета 'Лебединое озеро'...", choreographer);

        // Распределяем актёров по спектаклям
        System.out.println("=== Распределение актёров ===");
        regularShow.addActor(actor1);
        regularShow.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // Пробуем добавить дубликат
        ballet.addActor(actor1);

        // Выводим списки актёров для каждого спектакля
        System.out.println("\n=== Списки актёров ===");
        regularShow.printActors();
        opera.printActors();
        ballet.printActors();

        // Заменяем актёра в спектакле
        System.out.println("\n=== Замена актёров ===");
        regularShow.replaceActor(actor3, "Сидорова"); // Заменяем существующего
        regularShow.replaceActor(actor2, "Несуществующий"); // Пробуем заменить несуществующего

        // Выводим обновлённый список
        System.out.println("\n=== Обновлённый список актёров ===");
        regularShow.printActors();

        // Выводим либретто для оперного и балетного спектаклей
        System.out.println("\n=== Либретто спектаклей ===");
        opera.printLibrettoText();
        System.out.println();
        ballet.printLibrettoText();

        // Выводим информацию о режиссёрах
        System.out.println("\n=== Информация о режиссёрах ===");
        director1.printDirectorInfo();
        director2.printDirectorInfo();

        System.out.println("\n🎭 Спектакли начинаются! Приятного просмотра! 🎭\n");
    }
}


