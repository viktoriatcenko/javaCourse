package lesson_12;

import java.util.HashMap;

public class Fridge {
    // fields
    private final HashMap<String , Integer> products = new HashMap<>();


    // constructor



    // methods
    public void putProducts(String product, Integer value) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + value);
        } else {
            products.put(product, value);
        }
    }

    public void getProducts(String product, Integer value) {
        // ���� �������� � ������������ ���
        if (!products.containsKey(product)) {
            System.out.println("������ �������� " + product + " ����");
            return;
        }

        // ���� �������� �� �������
        if (products.get(product) < value) {
            System.out.println("�� ������� " + (value - products.get(product) +
                    ", �� ����� " + products.get(product) + " " + product));
            return;
        }
        // ���� �������� ������, ��� �����
        if (products.get(product) > value) {
            System.out.println("�������� ��� " + (products.get(product) - value) + " " + product);
            products.remove(product);
            return;
        }

        // ���� �������� ����� �������, ������� �����
        if (products.get(product) == value) {
            System.out.println("��� �������� �������");
            products.remove(product);
            return;
        }
    }

}
