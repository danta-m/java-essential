package lesson003.homeTask03.task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код доступа: ");
        String key = scanner.nextLine();

        if (key.equals("pro")) {
            DocumentWorker proVersion = new ProDocumentWorker();
            proVersion.openDocument();
            proVersion.editDocument(); //pro выводит не верно!!
            proVersion.saveDocument();
        } else if (key.equals("exp")) {
            ExpertDocumentWorker expertVersion = new ExpertDocumentWorker();
            expertVersion.openDocument();
            expertVersion.editDocument();
            expertVersion.saveDocument();
        } else {
            DocumentWorker freeVersion = new DocumentWorker();
            freeVersion.openDocument();
            freeVersion.editDocument();
            freeVersion.saveDocument();
        }
    }
}
