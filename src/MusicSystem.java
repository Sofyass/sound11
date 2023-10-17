/**
 * Класс MusicSystem предназначен для
 * демонстрации работы классов PlaybackDevice и StorageDevice, а также методов playSong и getSong.
 * @author Серявина Софья
 */
import java.util.Scanner; // Импорт класса Scanner из пакета java.util.
public class MusicSystem { // Объявление публичного класса MusicSystem.
    public static void main(String[] args) {
        // Создание объектов звуковоспроизводящих устройств
        PlaybackDevice vinylPlayer = new PlaybackDevice("Виниловая вертушка"); // Создание объекта класса PlaybackDevice с названием "Виниловая вертушка".
        PlaybackDevice cdPlayer = new PlaybackDevice("CD-плеер"); // Создание объекта класса PlaybackDevice с названием "CD-плеер".
        PlaybackDevice universalPlayer = new PlaybackDevice("Универсальный плеер"); // Создание объекта класса PlaybackDevice с названием "Универсальный плеер".

        // Создание объектов носителей музыкальных композиций
        StorageDevice vinyl = new StorageDevice("Пластинка"); // Создание объекта класса StorageDevice с названием "Пластинка".
        StorageDevice cd = new StorageDevice("CD"); // Создание объекта класса StorageDevice с названием "CD".
        StorageDevice flashDrive = new StorageDevice("Флешка"); // Создание объекта класса StorageDevice с названием "Флешка".


        // Ввод пользователем информации о песне и устройстве воспроизведения
        Scanner scanner = new Scanner(System.in); //  Создание объекта класса Scanner для считывания ввода пользователя.
        System.out.println("Введите номер песни (1-3):"); //  Вывод на консоль сообщения с запросом ввода номера песни.
        int songNumber = scanner.nextInt(); // Считывание введенного пользователем номера песни.
        System.out.println("Выберите устройство воспроизведения (1 - виниловая вертушка, 2 - CD-плеер, 3 - универсальный плеер):"); // Вывод на консоль сообщения с запросом ввода номера устройства воспроизведения.
        int deviceNumber = scanner.nextInt(); // Считывание введенного пользователем номера устройства воспроизведения.
        System.out.println("Выберите носитель (1 - Пластинка, 2 - CD, 3 - Флешка):"); //  Вывод на консоль сообщения с запросом ввода номера носителя.
        int playNumber = scanner.nextInt(); // Считывание введенного пользователем номера носителя.

        // Условная конструкция для выбора устройства и носителя для воспроизведения песни и вызов соответствующего метода playSong.
        if (deviceNumber == 1 && playNumber == 1){
            vinylPlayer.playSong(getSongFromStorage(songNumber, vinyl), vinyl);
        }
        else if (deviceNumber == 2 && playNumber == 2){
            cdPlayer.playSong(getSongFromStorage(songNumber, cd), cd);
        }
        else if (deviceNumber == 3 && playNumber == 3){
            universalPlayer.playSong(getSongFromStorage(songNumber, flashDrive), flashDrive);
        }
        else if (deviceNumber <= 3 && deviceNumber >= 1 && playNumber <=3 && playNumber >=1) {
            System.out.println("C данного носителя нельзя воспроизвести песню на данном воспроизводителе");
        }
        else {
            System.out.println("Такого носителя воспроизводителя нет");
        }
    }

    // Объявление статического метода getSongFromStorage для получения песни из указанного носителя по ее номеру.
    private static Song getSongFromStorage(int songNumber, StorageDevice storageDevice) {
        return storageDevice.getSong(songNumber - 1); // Возврат песни с указанным номером из указанного носителя.
    }
}