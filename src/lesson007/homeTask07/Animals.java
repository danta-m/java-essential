package lesson007.homeTask07;

public enum Animals {

    PENGUIN(3), TIGER(9), LION(7), RHINO(10), WOLF(2), MONKEY(3), GIRAFFES(5);

    private int years;

    Animals(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Animals: " + name() +
                ", " + years + " years";
    }
}

class Main {
    public static void main(String[] args) {
        Animals penguin = Animals.PENGUIN;
        Animals tiger = Animals.TIGER;
        Animals lion = Animals.LION;
        Animals rhino = Animals.RHINO;
        Animals wolf = Animals.WOLF;
        Animals monkey = Animals.MONKEY;
        Animals giraffes = Animals.GIRAFFES;


        System.out.println(penguin);
        System.out.println(tiger);
        System.out.println(lion);
        System.out.println(rhino);
        System.out.println(wolf);
        System.out.println(monkey);
        System.out.println(giraffes);
    }
}
