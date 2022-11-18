package lesson_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork {
    static List<BigContact> list = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] array = new int [20];
        int i = 0;
        int max = array [0];

        for (; i < 20; i++) {
            array[i] = scanner.nextInt();
        } i = 0;
        int min = array [0];
        while (i < 20) {
            if (array[i] > max) {
                max = array[i];
                i++;
            }
            else if (array[i] < min) {
                min = array[i];
                i++;
            } else {
                i++;
            }
        }

        System.out.println(max + " " + min);


        boolean a = addUnit(new Contact1());

    }

    public static boolean addUnit(BigContact b) {
        try {
            list.add(b);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
