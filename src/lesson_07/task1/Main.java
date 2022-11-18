package lesson_07.task1;


public class Main {
    public static void main(String[] args) {
        Animal [] zooPark = new Animal[10];

        Dog sharik = new Dog();
        Cat murzik = new Cat();
        Horse horse = new Horse();

        sharik.setFood("Bones");
        sharik.setLocation("Dvor");

        murzik.setFood("Milk");
        murzik.setLocation("Dvor");

        horse.setFood("Seno");
        horse.setLocation("Sarai");

        zooPark[0] = sharik;
        zooPark [1] = murzik;
        zooPark [2] = horse;

        Veterinar aibolit = new Veterinar();

        for (int i = 0; i < zooPark.length; i++) {
            if (zooPark[i] != null) {
                aibolit.treatAnimal(zooPark[i]);
            }
        }
    }
}
