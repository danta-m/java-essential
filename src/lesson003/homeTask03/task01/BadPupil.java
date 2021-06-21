package lesson003.homeTask03.task01;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Your scores for study are too low. Try harder!");
    }

    @Override
    void read() {
        System.out.println("Your scores for study are too low. Try harder!");
    }

    @Override
    void write() {
        System.out.println("Your scores for study are too low. Try harder!");
    }

    @Override
    void relax() {
        System.out.println("Your scores for study are too low. Try harder!");
    }
}
