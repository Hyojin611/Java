package oopCh05;

public class Cho5Main {
    public static void main(String[] args) {

        Animal dog2 = new Dog();
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.speak();
        dog.defence();

        dog2.speak();
        dog2.defence();

        cat.speak();
        cat.그루밍();
        cat.defence();
    }
}
