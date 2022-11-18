package lesson_05;

import java.util.Scanner;

public class String_Application {
    public static void main(String[] args) {
        String str = "Hello World!";
        String str1 = new String("Hello World");
        str1 += "!"; // str = str + "!";

        System.out.println(str);
        System.out.println(str1);

        for (int i = 0; i < 10000; i++) {
            str1 += "!";
        }
        System.out.println(str1);

        /**
         String !
         length() - возвращает длину строки

         concat(): объединяет строки / +=

         equals(): сравнивает строки с учетом регистра

         equalsIgnoreCase(): сравнивает строки без учета регистра

         startsWith(): определяет, начинается ли строка с подстроки

         endsWith(): определяет, заканчивается ли строка на определенную подстроку

         String replace(char oldChar, char newChar)
         Возвращает новую строку, в результате, заменив все вхождения oldChar в этой строке на newChar.

         String[] split(String regex)
         Разделяет эту строку, окружая данным регулярным выражением.

         trim(): удаляет начальные и конечные пробелы

         toLowerCase(): переводит все символы строки в нижний регистр

         toUpperCase(): переводит все символы строки в верхний регистр
         * */

        int length = str1.length();
        System.out.println(length);

        String str2 = "hello world!";

        boolean equals = "Hello World!".equals(str);
        boolean b = str.equalsIgnoreCase(str2);

        boolean hello = str2.startsWith("world");
        boolean b1 = str2.endsWith("world!");

        String str3 = str2.replace("world", "Russia");

        String letter = "Hello my dear friend ";




        System.out.println(equals);
        System.out.println(b);
        System.out.println(hello);
        System.out.println(b1);

        System.out.println(str3);

        String [] arr = letter.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toUpperCase() + " ");
        }

        System.out.print("\n");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].toLowerCase() + " ");
        }

        System.out.print("\n");

        String str4 = letter.trim();

        System.out.println(str4);

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int age = scanner.nextInt();


        System.out.printf("Меня зовут %s. Мне %d год.  ", name, age);

    }
}
