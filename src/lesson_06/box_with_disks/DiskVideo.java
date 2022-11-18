package lesson_06.box_with_disks;

public class DiskVideo extends Disk{
    // Поля
//    private String name; // название фильма
//    private int year; // год выхода
    private String studio; // студия-издатель
    private String director; // режиссер
    private int longTime; // продолжительность фильма

    // Конструктор

    public DiskVideo(String name, int year) {
        super(name, year);
    }

    @Override
    public void printAllInfo() {
        System.out.println(getName() + " " + getYear() + " " + getDirector() + " " + getStudio() + " "
        + getLongTime());
    }


    public DiskVideo(String name, int year, String studio, String director, int longTime) {
        super(name, year);
        this.studio = studio;
        this.director = director;
        this.longTime = longTime;
    }

    // Методы


    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLongTime() {
        return longTime;
    }

    public void setLongTime(int longTime) {
        this.longTime = longTime;
    }
}
