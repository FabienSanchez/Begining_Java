package Animals;

abstract public class Animals implements Bonjour {

    public static void main(String[] args) {
        Animals humain, chien;
        humain = new Human();
        chien = new Dog();
        System.out.println("Human say : " + humain.sayHello());
        System.out.println("Dog say : " + chien.sayHello());
    }
}
