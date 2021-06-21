package lesson004.homeTask04.task01;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Открыт txt документ.");
    }

    @Override
    void create() {
        System.out.println("Создан txt документ.");
    }

    @Override
    void change() {
        System.out.println("Изменен txt документ.");
    }

    @Override
    void save() {
        System.out.println("Сохранен txt документ.");
    }
}
