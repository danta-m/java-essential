package lesson006.homeTask06.task01;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add(0, "Penguins");
        animals.add(1,"Tigers");
        animals.add(2, "Lions");
        animals.add(3, "Rhinos");
        animals.add(4, "Monkeys");
        animals.add(5, "Camels");
        animals.add(6, "Giraffes");
        animals.add(7, "Wolves");

//        animals.add("Penguins");
//        animals.add("Tigers");
//        animals.add("Lions");
//        animals.add("Rhinos");
//        animals.add("Monkeys");
//        animals.add("Camels");
//        animals.add("Giraffes");
//        animals.add("Wolves");

        for (String animal : animals) {
            System.out.println("Animals: " + animal);
        }

        System.out.println("------------");

//        Iterator<String> animalsIterator = animals.iterator();
//        while (animalsIterator.hasNext()) {
//            String text = animalsIterator.next();
//            System.out.println("Animals: " + text);
//        }

//        System.out.println("------------");

        task02 list = new task02();
        list.remove(animals);
        list.listLength(animals);
        System.out.println(animals);
        System.out.println("------------");
    }
}
