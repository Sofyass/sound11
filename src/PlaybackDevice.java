/**
 * Класс PlaybackDevice предназначен для создания объектов
 * звуковоспроизводящих устройств и воспроизведения на них музыкальных композиций.
 * @author Серявина Софья
 */
public class PlaybackDevice {
    private final String type;
    public PlaybackDevice(String type) {
        //Конструктор класса, который принимает тип звуковоспроизводящего устройства и инициализирует его в поле type.
        this.type = type;
    }

    public void playSong(Song song, StorageDevice storageDevice) {
        /* Метод, который принимает объект песни и объект носителя музыкальной композиции,
        и выводит информацию о воспроизведении на консоль. */
        System.out.println("Воспроизведение песни '" + song.getTitle() + "' исполнителя " + song.getArtist() + " на " + type);
    }
}