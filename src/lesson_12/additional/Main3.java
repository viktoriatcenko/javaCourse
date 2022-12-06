package lesson_12.additional;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Specialist specialist1 = new Specialist("Vasiliy", 10000, Specialty.DEVELOPER);
        Specialist specialist2 = new Specialist("Viktor", 23000, Specialty.DEVOPS);
        Specialist specialist3 = new Specialist("Alexandr", 100000, Specialty.PROJECT_MANAGER);
        Specialist specialist4 = new Specialist("Igor", 12000, Specialty.DEVELOPER);
        Specialist specialist5 = new Specialist("Nikolay", 50000, Specialty.DEVELOPER);
        Specialist specialist6 = new Specialist("John", 5000, Specialty.DEVOPS);

        List<Specialist> specs = new ArrayList<>();
        specs.add(specialist1);
        specs.add(specialist2);
        specs.add(specialist3);
        specs.add(specialist4);
        specs.add(specialist5);
        specs.add(specialist6);

        Util.oldFindByName(specs, "Vas");
        Util.newFindByName(specs, "Nik").forEach(x -> System.out.println(x));


    }
}
