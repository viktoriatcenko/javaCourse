package lesson_06;

public class Main {
    public static void main(String[] args) {
        Cat neizv = new Cat();
        Cat barsik = new Cat("Barsik");
        Cat snezhok = new Cat("Snezhok", 7, 8.3,"Ginger");
        System.out.print(barsik.getName() + " "  + snezhok.getName()
                + " "
                + neizv.getName()
                + " ");

        snezhok.setAge(8);
        neizv.setName("Kot");
        neizv.setAge(3);
        neizv.setWeight(5.2);
        neizv.setColor("Grey");
        System.out.println();

        Dog sharik = new Dog("Sharik", 10, 12.5, "White");

        snezhok.say();
        sharik.say();

    }
}
