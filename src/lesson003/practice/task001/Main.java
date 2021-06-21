package lesson003.practice.task001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сообщение: ");
    Scanner scanner = new Scanner(System.in);
    String textMessage = scanner.nextLine();

    Printer printer = new Printer();
        printer.print(textMessage);

        Printer printer2 = new PrinterColor();
        printer2.print(textMessage);
    }
}
