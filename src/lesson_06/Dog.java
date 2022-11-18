package lesson_06;

public class Dog extends Animal {

    // Поля


    // Конструктор

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }


    // Методы


    @Override
    public void say() {
        System.out.println("Dog is barking");
    }
}
