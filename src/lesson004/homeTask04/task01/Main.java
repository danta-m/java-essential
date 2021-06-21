package lesson004.homeTask04.task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String example2 = "doc";
        String example1 = "txt";
        String example3 = "xml";

        AbstractHandler docFile = new DOCHandler();
        AbstractHandler txtFile = new TXTHandler();
        AbstractHandler xmlFile = new XMLHandler();

        if (example1.equals("doc")) {
            docFile.open();
            docFile.create();
            docFile.change();
            docFile.save();
        } else if (example1.equals("txt")) {
            txtFile.open();
            txtFile.create();
            txtFile.change();
            txtFile.save();
        } else if (example1.equals("xml")) {
            xmlFile.open();
            xmlFile.create();
            xmlFile.change();
            xmlFile.save();
        } else {
            System.out.println("Неправильное имя файла");
        }
    }
}
