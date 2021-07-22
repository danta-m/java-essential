package lesson008.homeTask08.task01Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Worker {
    String surname;
    String positionHeld;
    int workExperience;

    Worker(String surname, String positionHeld, int workExperience) {
        this.surname = surname;
        this.positionHeld = positionHeld;
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "ФИО - " + surname + '\'' +
                ", Должность - '" + positionHeld + '\'' +
                ", Опыт работы - " + workExperience + " г.";
    }
}

class Main {
    public static void main(String[] args) {
        int workExperience;
        Worker[] workers = new Worker[5];

        workers[0] = new Worker("Авдыш А. С.", "Исполнительный директор", 7);
        workers[1] = new Worker("Шарый Е. В.", "Копирайтер", 2);
        workers[2] = new Worker("Луник В.Д.", "Системный администратор", 5);
        workers[3] = new Worker("Ляшко Д. М.", "Маркетолог", 10);

        for (int i = 4; i < workers.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите свою фамилию: ");
            String surname = scanner.nextLine();

            System.out.println("Введите название своей должности: ");
            String positionHeld = scanner.nextLine();

            System.out.println("Введите год начала работы: ");
            int yearOfJoining = 0;

            try {
                yearOfJoining = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Вы ввели неправильный формат года трудоустройства");
                break;
            }

            workExperience = 2021 - yearOfJoining;
            if (workExperience < 0 || workExperience >= 50) {
                System.out.println("Вы ввели неправильный год трудоустройства");
            }

            workers[i] = new Worker(surname, positionHeld, workExperience);
        }

        Arrays.sort(workers, new ComparatorBySurname());
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i]);
        }

        System.out.println("--------------");

        Arrays.sort(workers, new ComparatorByExperience());

        System.out.println("---------------");
        System.out.println("Сортировка сотрудников по опыту работы:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        System.out.println("---------------");
        System.out.println("Наибольший опыт работы в сотрудника: "
                + workers[0].surname + "Опыт работы - " + workers[4].workExperience);
    }
}

class ComparatorByExperience implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        int temp = o1.workExperience - o2.workExperience;
        return temp;
    }
}

class ComparatorBySurname implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.toString().compareTo(o2.toString());
    }
}

