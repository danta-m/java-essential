package lesson001.homeTask01.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите длину сторон прямоугольника в см: ");
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        rectangle.side1 = scanner.nextDouble();
        rectangle.side2 = scanner.nextDouble();

        System.out.println("Площадь прямоугольника равна: " + rectangle.areaCalculator(rectangle.side1, rectangle.side2) + " см");
        System.out.println("Периметр прямоугольник равен: " + rectangle.perimeterCalculator(rectangle.side1, rectangle.side2) + " см");

    }
}
