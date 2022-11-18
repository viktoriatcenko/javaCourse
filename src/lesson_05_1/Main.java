package lesson_05_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        int d = 0;
//        int e = 0;
//        int f = 0;
//        int g = 0;
//        int [] array = new int[7];
//
//        array[0] = 11;
//        array[1] = 22;
//        array[2] = 33;
//        array[3] = 44;
//        array[4] = 55;
//        array[5] = 66;
//        array[6] = 77;

        //1. —оздать массив на 20 чисел.
//2. ¬вести в него значени€ с клавиатуры.
//3. —оздать два массива на 10 чисел каждый.
//4. —копировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. ¬ывести второй маленький массив на экран, каждое значение выводить с новой строки.
        
//        int[] array = new int [20];
//        int [] array1 = new int[10];
//        int [] array2 = new int[10];
//
//        Scanner scanner = new Scanner(System.in);
//        int a = array.length;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < array.length / 2; i++) {
//            array1[i] = array[i];
//            array2[i] = array[array.length / 2 + i];
//        }
//
//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(array2[i]);
//        }

        //«адача: Ќаписать программу, котора€ вводит с клавиатуры 20 чисел и выводит их в убывающем пор€дке.

        int [] array = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) { // 32, 14, 5, 85, 114
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println();





    }
}
