package lesson_07;

public class Person1 implements PeopleInterface {
    @Override
    public void run() {
        System.out.println("Трусцой");
    }

    @Override
    public void jump() {
        System.out.println("Вприпрыжку");
    }

    @Override
    public void laugh() {
        System.out.println("Взахлеб");
    }

    @Override
    public void cry() {
        System.out.println("От счатсья");
    }

    @Override
    public void suffer() {
        System.out.println("От большого кол-ва денег");
    }
}
