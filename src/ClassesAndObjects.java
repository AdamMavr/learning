// публичный класс это главный класс, и он может быть только один. но может быть несколько обычных классов. класс это тип данных который мы создаём сами.
public class ClassesAndObjects {
    public static void main (String[] args) {
        Person firstPerson = new Person();
        firstPerson.setMainInfo("Adam", 24, "dev");
        firstPerson.greeting();


        Person secondPerson = new Person();
        secondPerson.setMainInfo("Vella", 27, "techsup");
        secondPerson.greeting();

        Person thirdPerson = new Person();
        thirdPerson.setMainInfo("Elea", 51, "pharm");
        thirdPerson.greeting();
    }
}

class Person {
    String name;
    int age;
    String prof;

    void setMainInfo(String username, int userage, String userprof) {
        name = username;
        age = userage;
        prof = userprof;
    }

    void greeting() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет." + " Моя профессия " + prof);
    }
}
