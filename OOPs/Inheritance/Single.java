package Inheritance;

public class Single {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
    }
}

//Base Class
class Animal {
    String color;
   
    void eat() {
        System.out.println("eats");
    }

    void breathe () {
        System.out.println("breathes");
    }
}

//Derived Class
class Fish extends Animal {
    int fins;

    void swim () {
        System.out.println("swims in water");
    }
}