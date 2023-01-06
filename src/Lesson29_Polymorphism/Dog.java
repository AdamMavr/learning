package Lesson29_Polymorphism;

public class Dog extends Animal {
    @Override // команда которая заставляет переопрделять метод родителя
    public void eat() {
        System.out.println("Dog is eating ");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}
