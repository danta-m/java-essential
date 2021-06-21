package lesson003.homeTask03.task02;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Ukraine", 15000, 2018, 250);
        Ship ship = new Ship("Spain", 500000, 2000, 43, 14, "Spain");
        Plane plane = new Plane("Ukraine", 170000, 2000, 450, 11000, 20);

        System.out.println("Car \nLocation: " + car.getCoordinates() + "\nPrice: " + car.getPriceVehicle() + "\nYear: "
        + car.getYearVehicle() + "\nSpeed: " + car.getSpeedVehicle());

        System.out.println("\nShip \nLocation: " + ship.getCoordinates() + "\nPrice: " + ship.getPriceVehicle() + "\nYear: "
                + ship.getYearVehicle() + "\nSpeed: " + ship.getSpeedVehicle() + "\nPossible number of Passengers: " +
                ship.getNumberOfPassengers() + "\nPort of Registry: " + ship.getPortOfRegistry());

        System.out.println("\nPlane \nLocation: " + plane.getCoordinates() + "\nPrice: " + plane.getPriceVehicle() + "\nYear: "
                + plane.getYearVehicle() + "\nSpeed: " + plane.getSpeedVehicle() + "\nPossible number of Passengers: " +
                plane.getNumberOfPassengers() + "\nMax height: " + plane.getHeight());
    }
}
