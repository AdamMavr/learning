// публичный класс это главный класс, и он может быть только один. но может быть несколько обычных классов. класс это тип данных который мы создаём сами.
public class ClassesAndObjects {
    public static void main (String[] args) {
        Person adam = new Person();
        adam.name = "Adam";
        adam.age = 24;
        adam.prof = "dev";
        adam.car = false;
        adam.greeting();


        Person vella = new Person();
        vella.name = "Vella";
        vella.age = 27;
        vella.prof = "designer";
        vella.car = false;
        vella.greeting();

        Person elena = new Person();
        elena.name = "Elena";
        elena.age = 50;
        elena.prof = "farm";
        elena.car = true;
        elena.sayHi();
    }
}

class Person {
    String name;
    int age;
    String prof;
    boolean car;

    void greeting() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет." + " Моя профессия " + prof);
    }

    void sayHi() {
        System.out.println("Привет");
    }
}