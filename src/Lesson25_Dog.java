// extends - ключевое слово позволяющее расширять существующий класс используя другой (наследование)

public class Lesson25_Dog extends Lesson25_Animal {

    public void eating() {
        System.out.println("Dog is eating");
    }

    public void bark() {
        System.out.println("I am barking");
    }

    public void showName(){
        System.out.println(name);
    }
}
