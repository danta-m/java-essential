//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson002.homeTask02.task02;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        this.year = 2001;
        this.speed = 200.0D;
        this.weight = 1225;
        this.color = "grey";
    }

    public Car(double speed) {
        this.year = 2020;
        this.speed = speed;
        this.weight = 1326;
        this.color = "red";
    }

    public Car(int year, double speed, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = 1350;
        this.color = color;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
