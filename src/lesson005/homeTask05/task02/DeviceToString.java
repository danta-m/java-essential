package lesson005.homeTask05.task02;

public class DeviceToString {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public DeviceToString(String manufacturer, float price, String serialNumber) {
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
        return "Device: manufacturer = Samsung, price = 120, serialNumber = AB1234567CD ";
    }
}


class Monitor extends DeviceToString {
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
//        super ("Monitor: " + "manufacturer = " + getManufacturer() +
//                        ", price = " + getPrice() +
//                        ", serial number = " + getSerialNumber() +
//                        ", X = " + getResolutionX() +
//                        ", Y = " + getResolutionY() );
        return "Monitor: manufacturer = Samsung, price = 120, serialNumber = AB1234567CD, X = 1280,Y = 1024 ";
    }
}


class EthernetAdapter extends DeviceToString {
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
}

class  Main {
    public static void main(String[] args) {
        DeviceToString device = new DeviceToString("HP", 1000, "2XN62AA");
        DeviceToString monitor1 = new Monitor("BenQ", 2100, "9HLJ1B", 3140, 2160);
        DeviceToString monitor2 = new Monitor("LG", 500, "35WN65C", 3440, 1440);
        DeviceToString monitor3 = new Monitor("BenQ", 2100, "9HLJ1B", 3140, 2160);

        DeviceToString ethernetAdapter1 = new EthernetAdapter("Cablexpert" , 17.8f, "A-CM-LAN-01", 900, "yes");
        DeviceToString ethernetAdapter2 = new EthernetAdapter("TP-LINK", 18, "UE330", 1000, "yes");
        DeviceToString ethernetAdapter3 = new EthernetAdapter("Cablexpert" , 17.8f, "A-CM-LAN-01", 900, "yes");

        System.out.println(device);

        System.out.println("\n" + monitor1);
        System.out.println(monitor2);
        System.out.println(monitor3);

        System.out.println("\n" + ethernetAdapter1);
        System.out.println(ethernetAdapter2);
        System.out.println(ethernetAdapter3);
    }
}

