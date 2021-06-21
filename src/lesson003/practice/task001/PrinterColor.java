package lesson003.practice.task001;

public class PrinterColor extends Printer {
    @Override
    void print(String value) {
        System.out.println((char) 27 + "[32m" + "Вы ввели текст: \n" + value + (char) 27 + "[35m");
    }
}
