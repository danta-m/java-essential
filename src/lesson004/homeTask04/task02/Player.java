package lesson004.homeTask04.task02;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void record() {
        System.out.println("RECORD");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    public static void main(String[] args) {
        Player player01 = new Player();

        player01.record();
        player01.play();
        player01.pause();
        player01.stop();
    }
    //Написать программу, которая выполняет проигрывание и запись.
}
