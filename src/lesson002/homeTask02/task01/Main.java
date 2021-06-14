//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lesson002.homeTask02.task01;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Car car1 = new Car(1998, "blue");
        Car car2 = new Car(2021);
        Car car3 = new Car();
        System.out.println("Авто №1 год выпуска: " + car1.year + ", цвет: " + car1.color);
        System.out.println("Авто №2 год выпуска: " + car2.year + ", цвет: " + car2.color);
        System.out.println("Авто №3 год выпуска: " + car3.year + ", цвет: " + car3.color);
    }
}
