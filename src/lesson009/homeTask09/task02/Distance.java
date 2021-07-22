package lesson009.homeTask09.task02;

public class Distance {
    private double distance;

    public Distance (double distance) {
        this.distance = distance;
    }

    void print () {
        System.out.println("Вы проехали дистанцию в " + distance + " километров");
    }

    static class Converter {

        public Converter() {

        }

        void kmToMeters (double distance) {
            double converter = (int) distance * 1000;
            System.out.println("Вы проехали дистанцию в " + converter + " метров");
        }

        void kmToMiles (double distance) {
            double converter = distance / 1.609;
            System.out.println("Вы проехали дистанцию в " + converter + " миль");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Distance distance = new Distance(200);
        Distance distance1 = new Distance(437.4);
        Distance distance2 = new Distance(844.66);

        distance.print();
        Distance.Converter converterDistance = new Distance.Converter();
        converterDistance.kmToMeters(200);
        converterDistance.kmToMiles(200);

        distance1.print();
        Distance.Converter converterDistance1 = new Distance.Converter();
        converterDistance1.kmToMiles(437.4);
        converterDistance1.kmToMeters(437.4);

        distance2.print();
        Distance.Converter converterDistance2 = new Distance.Converter();
        converterDistance2.kmToMiles(844.66); //Можно ли чтобы сюда вводилось число-параметр автоматически от Distance2 ?
        converterDistance2.kmToMeters(844.66);
    }
}
