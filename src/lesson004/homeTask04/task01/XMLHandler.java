package lesson004.homeTask04.task01;

public class XMLHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Открыт xml документ.");
    }

    @Override
    void create() {
        System.out.println("Создан xml документ.");
    }

    @Override
    void change() {
        System.out.println("Изменен xml документ.");
    }

    @Override
    void save() {
        System.out.println("Сохранен xml документ.");
    }
}
