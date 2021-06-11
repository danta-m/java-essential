package lesson001.homeTask01.task03;

import java.util.Arrays;

public class Computer {
    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < computers.length; i++ ) {
            System.out.println("Номер компьютера: " + (i+1));
        }
    }
}