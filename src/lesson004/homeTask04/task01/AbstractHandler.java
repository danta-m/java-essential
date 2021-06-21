package lesson004.homeTask04.task01;
//Написать программу, которая будет выполнять определение документа и для каждого формата должны
//быть методы открытия, создания, редактирования, сохранения определенного формата документа.

public abstract class AbstractHandler {
    abstract void open();

    abstract void create();

    abstract void change();

    abstract void save() ;

}
