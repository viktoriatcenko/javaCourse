package lesson_05;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        /**
         ћетоды-
         Ќазвание класса (файла) должно четко отвечать на вопрос какие в нем собраны методы.
         ћетоды лучше разбивать по смыслам на разные классы (файлы),
         не должны быть все методы собраны в одном классе;
         ‘ормула создани€ метода-
         1- модификатор доступа - это одно из 4-х видов слов,
         указываетс€ перед методом или классом:
         public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случоев используетс€);
         protected - внутри пакета и его наследникам, то есть дочерним классам,
         расположенных в других пакетах в данном проекте;
         --------- будет доступен только внутри текущего пакета (текущей папки);
         private - только внутри текущего класса (файла);
         -—татичность - два варианта: может быть указан признак статичности, либо нет:
         - не static, если метод будет вызыватьс€ у переменной text.split(" ");, то он не должен быть static; static - если метод будет вызыватьс€ у тuпа String.copyValue0f(char[] data);
         -¬озвращаемый тип или слово void если метод ни чего не возвращает:
         public static int - если метод будет возвращать число; public static char[] - если возвращает массив символов;
         public static String - если возвращает строку;
         public static ****** - прочие варианты возвращаемых типов; public static void - если ни чего не возвращает, а просто выполн€етс€, например, печать на консоль;
         4 - Ќазвание метода: по€сн€ющее его суть, с моленькай буквы;
         5 - ¬ход€щие параметры в круглых скобках один или много через зап€тую с указанием типа
         6 - тело метода (то что должно происходить, когда метод вызовут);
         public static void 				printMassiveToConsole(int[][] mass)
         ћодификаторы доступа метода			—игнатура метода

         * */

        Util util = new Util();
        util.print();

        Util.print1();

        int summa = util.getSumma(10, 15);

        System.out.println(summa);





        Contact1 vasya = new Contact1("¬ас€", "+79512148945", "mail@yandex.ru");
        Contact1 vitalik = new Contact1("¬италий", "+79512148961", "mail@yandex.ru");
        Contact1 olga = new Contact1("ќльга", "+7951214812", "mail@yandex.ru");
        Contact1 katya = new Contact1("≈катерина", "+79512148132", "mail@yandex.ru");
        Contact1 viktor = new Contact1("¬иктор", "+79512148102", "mail@yandex.ru");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact(vasya);
        phoneBook.addContact(vitalik);
        phoneBook.addContact(olga);
        phoneBook.addContact(katya);
        phoneBook.addContact(viktor);

        Scanner scanner = new Scanner(System.in);
        System.out.println("¬¬едите им€ контакта, который хотели бы переменовать");
        String original = scanner.nextLine();
        System.out.println("¬¬едите им€ на которое вы хотели бы переменовать " + original);
        String renamed = scanner.nextLine();

        phoneBook.renameContact(original, renamed);




        System.out.println();



    }
}
