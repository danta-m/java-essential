package lesson003.homeTask03.task02;

public class Vehicle {
    private String coordinates;
    private double priceVehicle;
    private int yearVehicle;
    private int speedVehicle;

    public Vehicle(String coordinates, double priceVehicle, int yearVehicle, int speedVehicle) {
        this.coordinates = coordinates;
        this.priceVehicle = priceVehicle;
        this.yearVehicle = yearVehicle;
        this.speedVehicle = speedVehicle;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public double getPriceVehicle() {
        return priceVehicle;
    }

    public int getYearVehicle() {
        return yearVehicle;
    }

    public int getSpeedVehicle() {
        return speedVehicle;
    }
}

class Plane extends Vehicle {

    private int height;
    private int numberOfPassengers;

    public Plane(String coordinates, double priceVehicle, int yearVehicle, int speedVehicle, int height, int numberOfPassengers) {
        super(coordinates, priceVehicle, yearVehicle, speedVehicle);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getHeight() {
        return height;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}


class Car extends Vehicle {

    public Car(String coordinates, double priceVehicle, int yearVehicle, int speedVehicle) {
        super(coordinates, priceVehicle, yearVehicle, speedVehicle);
    }
}


class Ship extends  Vehicle {

    private int numberOfPassengers;
    private String portOfRegistry;

    public Ship(String coordinates, double priceVehicle, int yearVehicle, int speedVehicle, int numberOfPassengers, String portOfRegistry) {
        super(coordinates, priceVehicle, yearVehicle, speedVehicle);
        this.numberOfPassengers = numberOfPassengers;
        this.portOfRegistry = portOfRegistry;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getPortOfRegistry() {
        return portOfRegistry;
    }
}

