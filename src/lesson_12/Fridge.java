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
        // Если продукта в холодильнике нет
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта " + product + " нету");
            return;
        }

        // Если продукта не хватает
        if (products.get(product) < value) {
            System.out.println("Не хватает " + (value - products.get(product) +
                    ", вы взяли " + products.get(product) + " " + product));
            return;
        }
        // Если продукта больше, чем берем
        if (products.get(product) > value) {
            System.out.println("Осталось еще " + (products.get(product) - value) + " " + product);
            products.remove(product);
            return;
        }

        // Если продукта ровно столько, сколько нужно
        if (products.get(product) == value) {
            System.out.println("Все продукты забрали");
            products.remove(product);
            return;
        }
    }

}
