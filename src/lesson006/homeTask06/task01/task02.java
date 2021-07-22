package lesson006.homeTask06.task01;

import java.util.ArrayList;

public class task02 {
    ArrayList remove (ArrayList animals){
        animals.remove(7);
        animals.remove(5);
        animals.remove(3);

        return (animals);
    }

    void listLength (ArrayList animals){
        System.out.println("Длина массива: " + animals.size());
    }
}
