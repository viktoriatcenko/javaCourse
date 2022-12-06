package lesson_12;

import lesson_12.additional.Day;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. ������� ��������� HashMap ��������� �������");
        HashMap<String , Integer> table = new HashMap<>();
        System.out.println("------------------------------------------------");
        table.put("Dinamo", 5);
        table.put("Shakhtar", 3);
        table.put("Spartak", 1);
        System.out.println("------------------------------------------------");
        System.out.println("2. ��� ������� ����� �������� ����� ������������");
        table.put("Spartak", 4);
        System.out.println("------------------------------------------------");
        System.out.println("3. containsKey() - ���������� �� ����� ���� � ����");
        System.out.println("------------------------------------------------");
        System.out.println(table.containsKey("Dinamo"));
        System.out.println(table.containsKey("Zenith"));
        System.out.println("------------------------------------------------");
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("aaa");
//        strings.add("bbb");
//        strings.add("ccc");
        System.out.println("4. ������ �� ��������� HashMap");
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------------------------------------");
        System.out.println("5. ������� ����� ����� ����");
        for (String key : table.keySet()) {
            System.out.println(key + ";");
        }
        System.out.println("------------------------------------------------");
        System.out.println("6. ������� �������� ����� ����");
        for (String key : table.keySet()) {
            System.out.println(table.get(key));
        }


        int a = 10;
        int b = 20;

        if (!(b > a)) {
            System.out.println(" B NE BOLSHE CHEM A");
        }

        Day today = Day.FRIDAY;
        Day [] days = Day.values();
        for (Day d : days) {
            System.out.println(d);
        }
    }
}
