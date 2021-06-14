//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson002.homeTask02.task03;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2009);
        Car car3 = new Car(2013, 280.0D);
        Car car4 = new Car(2017, 300.0D, 1800, "red");
        System.out.println("Авто №1 год выпуска: " + car1.year + ", скорость в км/час: " + car1.speed + ", вес в кг: " + car1.weight + ", цвет: " + car1.color);
        System.out.println("Авто №2 год выпуска: " + car2.year + ", скорость в км/час: " + car2.speed + ", вес в кг: " + car2.weight + ", цвет: " + car2.color);
        System.out.println("Авто №3 год выпуска: " + car3.year + ", скорость в км/час: " + car3.speed + ", вес в кг: " + car3.weight + ", цвет: " + car3.color);
        System.out.println("Авто №4 год выпуска: " + car4.year + ", скорость в км/час: " + car4.speed + ", вес в кг: " + car4.weight + ", цвет: " + car4.color);
    }
}
