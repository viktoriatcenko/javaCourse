package lesson_12;

public class Main2 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        fridge.putProducts("������", 2);
        fridge.putProducts("������", 1);
        fridge.putProducts("�����", 3);
        fridge.putProducts("�����", 3);
        fridge.putProducts("��������", 2);
        fridge.putProducts("����", 4);
        fridge.putProducts("�����", 10);


        fridge.getProducts("������", 5);
        fridge.getProducts("������", 1);
        fridge.getProducts("�����", 5);
        fridge.getProducts("��������", 2);


        fridge.putProducts("�����", 10);


    }
}
