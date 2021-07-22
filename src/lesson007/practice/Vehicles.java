package lesson007.practice;

import lesson009.homeTask09.task01.Vehicle;

public enum Vehicles {
    CAR(15_000), BOAT(150_000), PLANE(1_500_000);

    private int value;
    private String color;

    Vehicles(int value) {
        this.value = value;
    }

    public void setColor(String setColor) {
        this.color = setColor;
    }

    public String getColor() {
        return getColor();
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                " type=" + name() +
                ", value=" + value +
                ", color='" + color + '\'' +
                '}';
    }
}

