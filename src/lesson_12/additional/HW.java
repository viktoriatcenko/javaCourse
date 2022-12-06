package lesson_12.additional;

import java.util.ArrayList;
import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listBasic = new ArrayList<>();
        ArrayList<String> listMaximum = new ArrayList<>(); // массив дл€ самых длинных строк
        ArrayList<String> listMinimum = new ArrayList<>(); // массив дл€ самых коротких строк

        for (int i = 0; i < 5; i++) {
            String str = scanner.nextLine();
            listBasic.add(str);
        }

        // Ќахождение самой длинной строки и добавление еЄ в список listMaximum

        int max = 0;

        long start = System.currentTimeMillis();

        for (int i = 0; i < listBasic.size(); i++) {
            if (listBasic.get(i).length() > max) {
                max = listBasic.get(i).length();
            }
        }

        for (String mx : listBasic) {
            if (mx.length() == max) {
                listMaximum.add(mx);
            }
        }

        long end = System.currentTimeMillis();

        // Ќахождение самой короткой строки и добавление еЄ в список listMinimum

        int min = listBasic.get(0).length();

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < listBasic.size(); i++) {
            if (listBasic.get(i).length() > min) {
                min = listBasic.get(i).length();
            }
        }

        for (String mn : listBasic) {
            if (mn.length() == min) {
                listMinimum.add(mn);
            }
        }

        long end1 = System.currentTimeMillis();

        // ¬ывод строки котора€ нашлась  раньше всего

        if ((end - start) > (end1 - start1)) {
            System.out.println(listMinimum.get(0));
        } else {
            System.out.println(listMaximum.get(0));
        }

//        else if ((end - start) < (end1 - start1)) {
//            System.out.println(listMaximum.get(0));
//        }
//        else {
//            System.out.println(" оротка€ и длинна€ строки наход€тс€ одновременно");
//        }
    }
}
