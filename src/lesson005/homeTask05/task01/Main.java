package lesson005.homeTask05.task01;

public class Main {
    public static void main(String[] args) {
        Device monitor1 = new Monitor("BenQ", 2100, "9HLJ1B", 3140, 2160);
        Device monitor2 = new Monitor("LG", 500, "35WN65C", 3440, 1440);
        Device monitor3 = new Monitor("BenQ", 2100, "9HLJ1B", 3140, 2160);

        Device ethernetAdapter1 = new EthernetAdapter("Cablexpert" , 17.8f, "A-CM-LAN-01", 900, "yes");
        Device ethernetAdapter2 = new EthernetAdapter("TP-LINK", 18, "UE330", 1000, "yes");
        Device ethernetAdapter3 = new EthernetAdapter("Cablexpert" , 17.8f, "A-CM-LAN-01", 900, "yes");

        System.out.println(monitor1);
        System.out.println(monitor2);
        System.out.println(monitor3);

        System.out.println(ethernetAdapter1);
        System.out.println(ethernetAdapter2);
    }
}
