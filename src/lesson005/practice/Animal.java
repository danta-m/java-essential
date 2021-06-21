package lesson005.practice;

public class Animal {
    String name;
    int age;
    boolean haveTail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.haveTail = tail;
    }

    @Override
    public String toString() {
        return "Animal: " +
                "name: " + name +
                ", age: " + age +
                ", tail: " + haveTail;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Animal.class) {
            Animal animal = (Animal) obj;
            boolean isName = animal.name == this.name;
            boolean isName2 = animal.name.equals(this.name);
            boolean isAge = animal.age == this.age;
            boolean isHaveTail = animal.haveTail == this.haveTail;
            return isName && isName2 && isAge && isHaveTail;

        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (this.haveTail ? 1 : 0);
        result = 37 * result + age;
        result = 37 * result + (this.name == null ? 0 : this.name.hashCode());
        return result;
    }
}
