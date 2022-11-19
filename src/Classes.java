// публичный класс это главный класс, и он может быть только один. но может быть несколько обычных классов. класс это тип данных который мы создаём сами.
public class Classes {
    public static void main (String[] args) {
        Person adam = new Person();
        adam.name = "Adam";
        adam.age = 24;
        adam.prof = "dev";
        adam.car = false;

        Person vella = new Person();
        vella.name = "Vella";
        vella.age = 27;
        vella.prof = "designer";
        vella.car = false;

        Person elena = new Person();
        elena.name = "Elena";
        elena.age = 50;
        elena.prof = "farm";
        elena.car = true;
    }
}

class Person {
    String name;
    int age;
    String prof;
    boolean car;
}