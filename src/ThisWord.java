//сеттеры и геттеры нужны чтобы достичь инкапсуляции для предотвращения прямого доступа к полям объекта, а также для проверки корректности значений
//this нужен когда у переменной класса и переменной метода/конструктора одинаковые имена
//static - делает переменную независимой от объекта. Она принадлежит не объектам класса, а самому классу, и статическая переменная будет делиться между всеми объектами этого класса.
//final - запрещает переменной изменяться (константа)
//конструктор это метод который вызывается при создании нового объекта. инициализирует поля объекта. У конструктора нет типа возвращаемого значения и его имя всегда долэно совпадать с именем класса. Конструктор срабатывает в зависимости от заданных в нём и в объекте параметров
//void - метод ничего не возвращает

public class ThisWord {
    public static void main(String[] args) {
        Human h1 = new Human("Adam", 24);
        Human h2 = new Human("Vella", 27);
        Human h3 = new Human();
        Human h4 = new Human("Elena", 52);
        h1.getInfo();
        h2.getInfo();
        h3.getInfo();
        h4.getInfo();
    }
}

class Human {
    private String name;
    private int age;

    //статичная переменная которая будет одинаковой для всех
    public static int countPeople;

    //Конструктор
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    //конструктор
    public Human() {
        this.name = "Безымянный";
        this.age = 0;
        countPeople++;
    }

    //сеттер
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //метод
    public void getInfo() {
        System.out.println("Name is: " + name + " | Age is: " + age);
    }

    //метод
    public void getAmount() {
        System.out.println("Total: " + countPeople);
    }

    //геттер
    public String getName() {
        return name;
    }
    //геттер
    public int getAge() {
        return age;
    }
}