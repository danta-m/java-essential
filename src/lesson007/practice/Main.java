package lesson007.practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Vehicles car = Vehicles.CAR;
        Vehicles boat = Vehicles.BOAT;
        Vehicles plane = Vehicles.PLANE;

        car.setColor("Green");
        boat.setColor("Blue");
        plane.setColor("White");

        System.out.println(car);
        System.out.println(boat);
        System.out.println(plane);

    }
}
