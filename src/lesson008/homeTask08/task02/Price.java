package lesson008.homeTask08.task02;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Price {
    String productName;
    String shopName;
    double price;

    public Price(String productName, String shopName, double price) {
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название товара: \"" + productName + '\"' +
                ", название магазина: \"" + shopName + '\"' +
                ", цена: " + price + " грн";
    }
}

class Main {
    public static void main(String[] args) {

        Price items[] = new Price[5];
        items[0] = new Price("Шуруповерт", "Эпицентр", 1800);
        items[1] = new Price("Матрас", "JYSK", 22999.99);
        items[2] = new Price("Электросамокат", "Citrus", 19999.99);
        items[3] = new Price("Coca Cola", "Novus", 24.44);
        items[4] = new Price("Манго", "Novus", 69.99);

        Arrays.sort(items, new ComparatorByShopName());


        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        System.out.println("---------------------------");
        System.out.println("Введите название магазина, ассортимент которого Вы хотите просмотреть: ");
        Scanner scanner = new Scanner(System.in);
        String choice = null;

        try { // Я не понимаю как в данном случае выхывать Ексепшин, если название не находит. Вызвала вручную
            choice = scanner.nextLine();

            if (choice.equals(items[0].shopName)) {
                System.out.println("Ассортимент данного магазина: \n" + items[0]);
            } else if (choice.equals(items[1].shopName)) {
                System.out.println("Ассортимент данного магазина: \n" + items[1]);
            } else if (choice.equals(items[2].shopName)) {
                System.out.println("Ассортимент данного магазина: \n" + items[2]);
            } else if (choice.equals(items[3].shopName)) {
                System.out.println("Ассортимент данного магазина: \n" + items[3]);
            } else if (choice.equals(items[4].shopName)) {
                System.out.println("Ассортимент данного магазина: \n" + items[4]);
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("Упс. Информации по данному магазину у нас нет. Попробуйте еще раз");
            System.out.println(e.getStackTrace());
        }
    }
}

class ComparatorByShopName implements Comparator<Price> {
    @Override
    public int compare(Price o1, Price o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
