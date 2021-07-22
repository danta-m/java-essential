package lesson009.homeTask09.task01;

public class Vehicle {

    public class Wheel {

        void print () {
            System.out.println("Wheel");
        }
    }

    class Door {

        void print () {
            System.out.println("Print");
        }
    }
    void print () {
        System.out.println("Vehicle");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.print();

        Vehicle.Wheel vehicleWheel = new Vehicle().new Wheel();
        vehicleWheel.print();

        Vehicle.Door vehicleDoor = new Vehicle().new Door();
        vehicleDoor.print();
    }
}
