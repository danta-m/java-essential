package lesson001.practice;

public class Main {

    public static void main(String[] args) {
        Address a = new Address();
        a.index = 45222;
        a.setCountry("Ukraine");
        a.setCity("Kyiv");
        a.setStreet("Khmelnitskogo");
        a.setHouse("43/4");
        a.setApartment("55А");

        System.out.println("Index - " + a.index + ", Country - " + a.getCountry() + ", City - " + a.getCity() + ", Street - " + a.getStreet() + ", House - " + a.getHouse() + ", Apartment - " + a.getApartment());
    }
}
