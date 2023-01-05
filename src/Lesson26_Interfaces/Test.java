package Lesson26_Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal fAnimal = new Animal(1);
        Person fPerson = new Person("Adam");
        fAnimal.showInfo();
        fPerson.showInfo();
    }
}
