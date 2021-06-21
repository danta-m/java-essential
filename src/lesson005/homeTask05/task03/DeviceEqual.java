package lesson005.homeTask05.task03;

import java.util.Objects;

public class DeviceEqual {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public DeviceEqual(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " +
                "\nmanufacturer: '" + getManufacturer() +
                ", price: " + getPrice() +
                ", serial Number: " + getSerialNumber();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (this.getManufacturer() == null ? 0 : this.getManufacturer().hashCode());
        result = (int) (37 * result + getPrice());
        result = 37 * result + (this.getSerialNumber() == null ? 0 : this.getSerialNumber().hashCode());
        return result;
    }
}


class Monitor extends DeviceEqual {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return ("Monitor: " + "\nmanufacturer = " + getManufacturer() +
                ", price = " + getPrice() +
                ", serial number = " + getSerialNumber() +
                ", X = " + getResolutionX() +
                ", Y = " + getResolutionY());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (this.getManufacturer() == null ? 0 : this.getManufacturer().hashCode());
        result = (int) (37 * result + getPrice());
        result = 37 * result + (this.getSerialNumber() == null ? 0 : this.getSerialNumber().hashCode());
        result = 37 * result + getResolutionX();
        result = 37 * result + getResolutionX();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        Monitor monitor = (Monitor) o;
        return getResolutionX() == monitor.getResolutionX() && getResolutionY() == monitor.getResolutionY();
//        тут сравнивают только данные по размерам? Или все, что и в классе родительском, плюс еще и размер?
    }
}


class EthernetAdapter extends DeviceEqual {
    private int Speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        Speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return Speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter: " +
                "\nManufactures: " + getManufacturer() +
                ", Price: " + getPrice() +
                ", Serial number: " + getSerialNumber() +
                ", Speed=" + Speed +
                ", mac='" + mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return getSpeed() == that.getSpeed() && Objects.equals(getMac(), that.getMac());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed(), getMac());
    }
}

class Main {
    public static void main(String[] args) {
        DeviceEqual monitor1 = new Monitor("BenQ", 2100, "9HLJ1B", 3140, 2160);
        DeviceEqual monitor2 = new Monitor("LG", 500, "35WN65C", 3440, 1440);
        DeviceEqual monitor3 = new Monitor("BenQ", 2100, "9HLJ1B", 3140, 2160);

        DeviceEqual ethernetAdapter1 = new EthernetAdapter("Cablexpert", 17.8f, "A-CM-LAN-01", 900, "yes");
        DeviceEqual ethernetAdapter2 = new EthernetAdapter("TP-LINK", 18, "UE330", 1000, "yes");
        DeviceEqual ethernetAdapter3 = new EthernetAdapter("Cablexpert", 17.8f, "A-CM-LAN-01", 900, "yes");

        System.out.println("\n" + monitor1);
        System.out.println(monitor2);
        System.out.println(monitor3);

        System.out.println("\n" + ethernetAdapter1);
        System.out.println(ethernetAdapter2);
        System.out.println(ethernetAdapter3);

        System.out.println(monitor1.equals(monitor2));
        System.out.println(monitor1.equals(monitor3));

        System.out.println(ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println(ethernetAdapter1.equals(ethernetAdapter3));

        System.out.println(monitor1.hashCode());
        System.out.println(monitor2.hashCode());
        System.out.println(monitor3.hashCode());

        System.out.println(ethernetAdapter1.hashCode());
        System.out.println(ethernetAdapter2.hashCode());
        System.out.println(ethernetAdapter3.hashCode());

    }
}