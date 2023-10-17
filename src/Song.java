/**
        * Класс Song предназначен для создания объектов песен.
        * @author Серявина Софья
        */
public class Song {
    private final String artist; // Поле, которое хранит имя исполнителя песни.
    private final String title;  // Поле, которое хранит название песни.

    public Song(String artist, String title) {
        // Конструктор класса, который принимает имя исполнителя и название песни и инициализирует соответствующие поля объекта.
        this.artist = artist;
        this.title = title;
    }

    public String getArtist() {
        // Метод, который возвращает имя исполнителя песни.
        return artist;
    }

    public String getTitle() {
        // Метод, который возвращает название песни.
        return title;
    }
}