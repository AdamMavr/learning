// полиморфизм используется для многоразовости кода. в данном примере метод тест сработал на 3 разных объектах

package Lesson29_Polymorphism;

public class Test {
    public static void main(String[] args) {

        // рассматриваем собаку как животное, где ей доступны методы животного
        Animal animal = new Animal();
        Animal animal1 = new Dog(); // создавая объект dog типа animal мы имеем доступ к методу eat но не имеем доступа к методу bark
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal1.eat();
        //  animal1.bark(); ошибка

        // рассматриваем собаку как собаку, где ей доступны спецефические методы собаки
        dog.eat();
        dog.bark();

        // dog наследуется от animal, поэтому для него работают все методы animal
        // animal.eat();
        // dog.eat();

        test(animal);
        test(dog);
        test(cat);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
