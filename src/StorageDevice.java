/**
 * Класс StorageDevice предназначен для создания объектов носителей музыкальных композиций и хранения на них песен.
 * @author Серявина Софья
 */
public class StorageDevice {
    private final String type; // Поле, которое хранит тип носителя музыкальной композиции.
    private final Song[] songs; // Поле, которое хранит массив объектов песен.

    public StorageDevice(String type) {
        /* Конструктор класса,
        который принимает тип носителя музыкальной композиции и инициализирует его в поле type.
        Также создает массив для хранения трех песен. */
        this.type = type;
        this.songs = new Song[3]; // Создаем массив для хранения трех песен
    }


    public void setSong(int index, Song song) {
        // Метод, который принимает индекс ячейки массива и объект песни, и устанавливает этот объект в указанную ячейку массива.
        if (index >= 0 && index < songs.length) {
            songs[index] = song;
        }
    }


    public Song getSong(int index) {
        /* Метод, который принимает индекс ячейки массива и
        возвращает объект песни из указанной ячейки массива. Если индекс выходит за пределы массива, возвращает null.
         */
        Song song1 = new Song("Billie Eilish", "No time to die"); // Создание объекта песни с заданными параметрами.
        Song song2 = new Song("Arctic Monkeys", "505"); // Создание объекта песни с заданными параметрами.
        Song song3 = new Song("Три дня дождя", "Подозрительно"); // Создание объекта песни с заданными параметрами.

        setSong(0, song1); // Устанавливаем объект song1 в первую ячейку массива
        setSong(1, song2); // Устанавливаем объект song2 во вторую ячейку массива
        setSong(2, song3); // Устанавливаем объект song3 в третью ячейку массива
        if (index >= 0 && index < songs.length) {
            /* Проверка, что индекс находится
             в пределах массива и возврат объекта песни из указанной ячейки массива. Если индекс выходит за пределы массива, возвращает null.
             */
            return songs[index];
        } else {
            return null;
        }
    }

}
