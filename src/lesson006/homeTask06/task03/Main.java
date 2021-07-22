package lesson006.homeTask06.task03;

import java.util.ArrayList;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < 13; i++) {
            listOfNumbers.add(i);
        }
        System.out.println(listOfNumbers);

        ListIterator<Integer> newNumbers = listOfNumbers.listIterator();

        while (newNumbers.hasNext()) {
            Integer i = newNumbers.next();
            i += 1;
            System.out.println(i);
        }
    }
}
