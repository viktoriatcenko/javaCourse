package lesson_06.box_with_disks;

public class DiskAudio extends Disk{
    // Поля
//    private String name; // название альбома
    private String singer; // исполнитель
//    private int year; // год выпуска
    private int countOfTracks; // количество треков


    // Конструктор

    public DiskAudio(String name, int year) {
        super(name, year);
    }

    @Override
    public void printAllInfo() {
        System.out.println(getName() + " " + getYear() + " " + getSinger() + " " + getCountOfTracks() + " ");
    }


    public DiskAudio(String name, int year, String singer, int countOfTracks) {
        super(name, year);
        this.singer = singer;
        this.countOfTracks = countOfTracks;
    }

    // Методы


    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCountOfTracks() {
        return countOfTracks;
    }

    public void setCountOfTracks(int countOfTracks) {
        this.countOfTracks = countOfTracks;
    }
}
