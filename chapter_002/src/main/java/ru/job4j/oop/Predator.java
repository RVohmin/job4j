package ru.job4j.oop;

public class Predator extends Animal {

    public Predator() {
        super();
        System.out.println("Predator");
    }

    public Predator(String name) {
        super(name);
        System.out.println("Predator " + name);
    }
    public static void main(String[] args) {
        Predator predator = new Predator();
        Predator predator2 = new Predator("lion");

    }
}
