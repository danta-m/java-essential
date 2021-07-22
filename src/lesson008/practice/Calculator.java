package lesson008.practice;

import java.util.Scanner;

public class Calculator {
    int add (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int sub (int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int mul (int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int div (int firstNumber, int secondNumber) {
        try {
            return  firstNumber / secondNumber;
        } catch (Exception e) {
            System.out.println("Делить на ноль запрещено. Начните программу с начала.");
            System.out.println(e.getMessage());
        }
        return -1;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println("Выберите какое арифметическую операцию вы хотите провести:");
        System.out.println("Сложение - нажмите \"+\" " +
                "\nВычитание - нажмите \"-\"" +
                "\nУмножение - нажмите \"*\" " +
                "\nДеление - нажмите \"/\"");

        Scanner scanner1 = new Scanner(System.in);
        String arithmeticsSign = scanner1.nextLine();

        Calculator arithmeticsOperation = new Calculator();
        switch (arithmeticsSign) {
            case "+" :
                System.out.println("Результат сложения = " + arithmeticsOperation.add(firstNumber, secondNumber));
                break;
            case "-" :
                System.out.println("Результат вычитания = " + arithmeticsOperation.sub(firstNumber, secondNumber));
                break;
            case "*" :
                System.out.println("Результат умножения = " + arithmeticsOperation.mul(firstNumber, secondNumber));
                break;
            case "/" :
                System.out.println("Результат деления = " + arithmeticsOperation.div(firstNumber, secondNumber));
                break;
        }
    }
}