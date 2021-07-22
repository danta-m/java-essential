package lesson006.practice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("Olga Vasilievna");
        teachers.add("Yulia Vasilievna");
        teachers.add("Nina Vladimirovna");
        teachers.add("Nataliya Andreevna");

        for (String teacher : teachers) {
            System.out.println(teacher);
        }

        System.out.println("Best teacher: " + teachers.indexOf("Olga Vasilievna"));
        System.out.println("Worst teacher: " + teachers.indexOf("Nataliya Andreevna"));
    }
}
