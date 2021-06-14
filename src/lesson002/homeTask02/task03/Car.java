//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson002.homeTask02.task03;

public class Car {
    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        this.year = 2000;
        this.speed = 250.0D;
        this.weight = 1800;
        this.color = "white";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 200.0D;
        this.weight = 2000;
        this.color = "black";
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = 265.0D;
        this.weight = 1960;
        this.color = "grey";
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = 1855;
        this.color = "navy";
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = "yellow";
    }
}
