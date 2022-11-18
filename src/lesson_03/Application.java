package lesson_03;

public class Application {
    public static void main(String[] args) {
        // Циклы
        // fori, while, foreach

        // fori

        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");


        for (int i = 0; i < 5 ; i++) {
            System.out.println(i);
        }

        System.out.println();

        // 1. вывести в цикле все четные числа от 1 до 50

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();


        // 2.  выести все цифры от 1 до 100, которые делятся на 3 и на 5 одновременно

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // 3. сложить цифры от 10 до 20
        int count = 0;

        for (int i = 10; i <= 20; i++) {
            count += i;
            if (i == 20) {
                System.out.println(count);
            }
        }

        // 4. вывести в консоль все числа от 10 до 40, но пропустив все цифры от 15 до 20

        for (int i = 10; i <= 40; i++) {
            if ( i < 15 || i > 20) {
                System.out.print(i + " ");
            }
        }

        // 5. вывести сумму всех четных числе от 10 до 50
        int summa = 0;

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                summa = summa + i;
            }
        }

        System.out.println(summa);

        int a;
        int a1 = 0;
        a1 += 4;

        int counter = 10;

        while (counter >= 0) {
            System.out.println("Обратный отчет. Осталось " + counter + " секунд");
            counter--;
        }

        Util3 util3 = new Util3();
        util3.print();

    }
}
