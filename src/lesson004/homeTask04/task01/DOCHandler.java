package lesson004.homeTask04.task01;

public class DOCHandler extends AbstractHandler {

    public DOCHandler() {
    }

    @Override
    void open() {
        System.out.println("Открыт doc документ.");
    }

    @Override
    void create() {
        System.out.println("Создан doc документ.");
    }

    @Override
    void change() {
        System.out.println("Изменен doc документ.");
    }

    @Override
    void save() {
        System.out.println("Сохранен doc документ.");
    }


}
