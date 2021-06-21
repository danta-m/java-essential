package lesson005.practice;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Pandora", 5, true);
        Animal cat2 = new Animal("Pandora", 5, true);
        Animal dog = new Animal("Lapot", 4, true);
        System.out.println(cat.toString());

        System.out.println(cat.equals(cat2));
        System.out.println(cat.equals(dog));
    }
}

