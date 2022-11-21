// публичный класс это главный класс, и он может быть только один. но может быть несколько обычных классов. класс это тип данных который мы создаём сами.
public class ClassesAndObjects {
    public static void main (String[] args) {
        Person firstPerson = new Person();
        firstPerson.setMainInfo("Адам", 24);
        firstPerson.greeting();
        System.out.println(firstPerson.getName());
        System.out.println(firstPerson.getAge());
    }
}


class Person {
    private String name;
    private int age;
    public void setMainInfo(String username, int userage) {
        name = username;
        age = userage;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    void greeting() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }
}
